package dev.projectearth.genoa_allocator_plugin.utils;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class ServerInstanceRequestInfo {
    private UUID instanceId;
    private UUID buildplateId;
    private String playerId;
}
