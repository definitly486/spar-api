package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: loaded from: classes3.dex */
public final class Ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f45469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f45470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EnumC4014zg f45471d;

    public Ag(byte[] bArr) throws InvalidProtocolBufferNanoException {
        Bg bgA = Bg.a(bArr);
        this.f45468a = bgA.f45536a;
        this.f45469b = bgA.f45538c;
        this.f45470c = bgA.f45537b;
        this.f45471d = a(bgA.f45539d);
    }

    public final byte[] a() {
        Bg bg2 = new Bg();
        bg2.f45536a = this.f45468a;
        bg2.f45538c = this.f45469b;
        bg2.f45537b = this.f45470c;
        int iOrdinal = this.f45471d.ordinal();
        int i13 = 1;
        if (iOrdinal != 1) {
            i13 = 2;
            if (iOrdinal != 2) {
                i13 = 0;
            }
        }
        bg2.f45539d = i13;
        return MessageNano.toByteArray(bg2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Ag.class != obj.getClass()) {
            return false;
        }
        Ag ag2 = (Ag) obj;
        return this.f45469b == ag2.f45469b && this.f45470c == ag2.f45470c && this.f45468a.equals(ag2.f45468a) && this.f45471d == ag2.f45471d;
    }

    public final int hashCode() {
        int iHashCode = this.f45468a.hashCode() * 31;
        long j13 = this.f45469b;
        int i13 = (iHashCode + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f45470c;
        return this.f45471d.hashCode() + ((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31);
    }

    public final String toString() {
        return "ReferrerInfo{installReferrer='" + this.f45468a + "', referrerClickTimestampSeconds=" + this.f45469b + ", installBeginTimestampSeconds=" + this.f45470c + ", source=" + this.f45471d + '}';
    }

    public Ag(String str, long j13, long j14, EnumC4014zg enumC4014zg) {
        this.f45468a = str;
        this.f45469b = j13;
        this.f45470c = j14;
        this.f45471d = enumC4014zg;
    }

    public static EnumC4014zg a(int i13) {
        if (i13 == 1) {
            return EnumC4014zg.f48613c;
        }
        if (i13 != 2) {
            return EnumC4014zg.f48612b;
        }
        return EnumC4014zg.f48614d;
    }
}
