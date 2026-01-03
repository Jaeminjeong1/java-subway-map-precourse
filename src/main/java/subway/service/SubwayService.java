package subway.service;

import subway.domain.Line;
import subway.domain.LineRepository;
import subway.domain.Station;
import subway.domain.StationRepository;

import java.util.ArrayList;
import java.util.List;

import static subway.util.ErrorMessage.*;


public class SubwayService {


    //Station

    public void addStation(String stationName) {
        if (!StationRepository.validateContains(stationName)) {
            StationRepository.addStation(Station.from(stationName));
            return;
        }
        throw new IllegalArgumentException(DUPLICATE_STATION_NAME_ERROR.getMessage());
    }

    public void deleteStation(String stationName) {
        if (StationRepository.validateContains(stationName)) {
            StationRepository.deleteStation(stationName);
            return;
        }
        throw new IllegalArgumentException(NOT_CONTAINS_STATION_NAME_ERROR.getMessage());
    }

    public List<Station> getAllStation() {
        return StationRepository.stations();
    }

    public void validateContainsStation(String stationName) {
        if (!StationRepository.validateContains(stationName)) {
            throw new IllegalArgumentException(NOT_CONTAINS_STATION_NAME_ERROR.getMessage());
        }
    }

    // Line

    public void validateContainsLine(String input) {
        if (!LineRepository.contains(input)) {
            throw new IllegalArgumentException(NOT_EXIST_LINE_ERROR.getMessage());
        }
    }

    public void addLine(String lineName, List<String> stations) {
        List<Station> stationList = new ArrayList<>();
        for (String station : stations) {
            stationList.add(Station.from(station));
        }

        LineRepository.addLine(Line.of(lineName, stationList));
    }

    public void deleteLine(String lineName) {
        if (LineRepository.contains(lineName)) {
            LineRepository.deleteLineByName(lineName);
            return;
        }
        throw new IllegalArgumentException(NOT_EXIST_LINE_ERROR.getMessage());
    }

    public List<Line> getAllLine() {
        return LineRepository.lines();
    }

}
