package dev.projectearth.genoa_allocator_plugin.utils;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class ServerBuildplateRequest {
    private UUID buildplateId;
    private String playerId;
}
