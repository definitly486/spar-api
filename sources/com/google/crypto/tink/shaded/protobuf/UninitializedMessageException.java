package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class UninitializedMessageException extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final List f23886zdlpuopuiu;

    public UninitializedMessageException(hkdspvbjdz hkdspvbjdzVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f23886zdlpuopuiu = null;
    }

    public InvalidProtocolBufferException iobyxmoadg() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
