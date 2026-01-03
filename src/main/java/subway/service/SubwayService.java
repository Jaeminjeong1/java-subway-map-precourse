package subway.service;

import subway.domain.LineRepository;
import subway.domain.Station;
import subway.domain.StationRepository;

import java.util.List;

import static subway.util.ErrorMessage.DUPLICATE_STATION_NAME_ERROR;
import static subway.util.ErrorMessage.NOT_CONTAINS_STATION_NAME_ERROR;


public class SubwayService {


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
        return StationRepository.getStations();
    }
}
