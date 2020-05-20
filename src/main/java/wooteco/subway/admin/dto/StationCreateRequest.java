package wooteco.subway.admin.dto;

import wooteco.subway.admin.domain.Station;

public class StationCreateRequest {
	private String name;

	private StationCreateRequest() {
	}

	public StationCreateRequest(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Station toStation() {
		return Station.of(name);
	}
}