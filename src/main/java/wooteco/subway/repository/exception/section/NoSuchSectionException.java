package wooteco.subway.repository.exception.section;

import java.util.NoSuchElementException;

public class NoSuchSectionException extends NoSuchElementException {

    public NoSuchSectionException(Long id) {
        super(String.format("지하철구간을 찾을 수 없습니다. [id : %d]", id));
    }
}