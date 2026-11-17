package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class UninitializedMessageException extends RuntimeException {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final List f60047zdlpuopuiu;

    public UninitializedMessageException(agtfadlqog agtfadlqogVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f60047zdlpuopuiu = null;
    }

    public InvalidProtocolBufferException iobyxmoadg() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
