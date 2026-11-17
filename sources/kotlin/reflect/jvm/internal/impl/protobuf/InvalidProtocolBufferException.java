package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class InvalidProtocolBufferException extends IOException {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private agtfadlqog f60046zdlpuopuiu;

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.f60046zdlpuopuiu = null;
    }

    static InvalidProtocolBufferException agtfadlqog() {
        return new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static InvalidProtocolBufferException btonecajqb() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    static InvalidProtocolBufferException draadjrbmk() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static InvalidProtocolBufferException dxjokdxxww() {
        return new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
    }

    static InvalidProtocolBufferException lqeggnwhkg() {
        return new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    static InvalidProtocolBufferException nufgyqmvbu() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    static InvalidProtocolBufferException rgvfuqvkyq() {
        return new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static InvalidProtocolBufferException vdvldrhtss() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static InvalidProtocolBufferException wkgbmnqykc() {
        return new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }

    public agtfadlqog iobyxmoadg() {
        return this.f60046zdlpuopuiu;
    }

    public InvalidProtocolBufferException ojitshcjhn(agtfadlqog agtfadlqogVar) {
        this.f60046zdlpuopuiu = agtfadlqogVar;
        return this;
    }
}
