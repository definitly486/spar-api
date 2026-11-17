package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3926w3 implements InterfaceC3951x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48263a;

    public C3926w3(int i13) {
        this.f48263a = i13;
    }

    public static InterfaceC3951x3 a(InterfaceC3951x3... interfaceC3951x3Arr) {
        return new C3926w3(b(interfaceC3951x3Arr));
    }

    public static int b(InterfaceC3951x3... interfaceC3951x3Arr) {
        int bytesTruncated = 0;
        for (InterfaceC3951x3 interfaceC3951x3 : interfaceC3951x3Arr) {
            if (interfaceC3951x3 != null) {
                bytesTruncated = interfaceC3951x3.getBytesTruncated() + bytesTruncated;
            }
        }
        return bytesTruncated;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3951x3
    public final int getBytesTruncated() {
        return this.f48263a;
    }

    public String toString() {
        return "BytesTruncatedInfo{bytesTruncated=" + this.f48263a + '}';
    }
}
