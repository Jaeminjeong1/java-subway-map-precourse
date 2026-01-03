package subway.domain;

import java.util.Collections;
import java.util.List;

public class Line {
    private String name;
    private List<Station> section;

    private Line(String name, List<Station> section) {
        this.name = name;
        this.section = section;
    }

    public static Line of (String name, List<Station> section) {
        return new Line(name, section);
    }

    public String getName() {
        return name;
    }

    public List<Station> getSection() {
        return List.copyOf(section);
    }

    public void addSection(Station station, int sequence) {
        section.add(sequence - 1, station);
    }

    public void deleteSection(Station station) {
        section.remove(station);
    }

    // 추가 기능 구현
}
