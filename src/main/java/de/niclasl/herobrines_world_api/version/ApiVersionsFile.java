package de.niclasl.herobrines_world_api.version;

import java.util.List;

public class ApiVersionsFile {

    private ApiVersion latest;
    private List<ApiMajorVersion> majors;

    public ApiVersion getLatest() {
        return latest;
    }

    public List<ApiMajorVersion> getMajors() {
        return majors;
    }
}