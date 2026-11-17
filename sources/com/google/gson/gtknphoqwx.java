package com.google.gson;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class gtknphoqwx extends nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Object f24952zdlpuopuiu;

    public gtknphoqwx(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f24952zdlpuopuiu = bool;
    }

    private static boolean rgvfuqvkyq(gtknphoqwx gtknphoqwxVar) {
        Object obj = gtknphoqwxVar.f24952zdlpuopuiu;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public Number agtfadlqog() {
        Object obj = this.f24952zdlpuopuiu;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new com.google.gson.internal.gxszxtbevo((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    @Override // com.google.gson.nufgyqmvbu
    public long eablkybsjg() {
        return vdvldrhtss() ? agtfadlqog().longValue() : Long.parseLong(gxszxtbevo());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gtknphoqwx.class != obj.getClass()) {
            return false;
        }
        gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj;
        if (this.f24952zdlpuopuiu == null) {
            return gtknphoqwxVar.f24952zdlpuopuiu == null;
        }
        if (rgvfuqvkyq(this) && rgvfuqvkyq(gtknphoqwxVar)) {
            return agtfadlqog().longValue() == gtknphoqwxVar.agtfadlqog().longValue();
        }
        Object obj2 = this.f24952zdlpuopuiu;
        if (!(obj2 instanceof Number) || !(gtknphoqwxVar.f24952zdlpuopuiu instanceof Number)) {
            return obj2.equals(gtknphoqwxVar.f24952zdlpuopuiu);
        }
        double dDoubleValue = agtfadlqog().doubleValue();
        double dDoubleValue2 = gtknphoqwxVar.agtfadlqog().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    @Override // com.google.gson.nufgyqmvbu
    public String gxszxtbevo() {
        Object obj = this.f24952zdlpuopuiu;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (vdvldrhtss()) {
            return agtfadlqog().toString();
        }
        if (ojitshcjhn()) {
            return ((Boolean) this.f24952zdlpuopuiu).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f24952zdlpuopuiu.getClass());
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f24952zdlpuopuiu == null) {
            return 31;
        }
        if (rgvfuqvkyq(this)) {
            jDoubleToLongBits = agtfadlqog().longValue();
        } else {
            Object obj = this.f24952zdlpuopuiu;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(agtfadlqog().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    @Override // com.google.gson.nufgyqmvbu
    public boolean iobyxmoadg() {
        return ojitshcjhn() ? ((Boolean) this.f24952zdlpuopuiu).booleanValue() : Boolean.parseBoolean(gxszxtbevo());
    }

    public boolean ojitshcjhn() {
        return this.f24952zdlpuopuiu instanceof Boolean;
    }

    public boolean oxmwwwfdhm() {
        return this.f24952zdlpuopuiu instanceof String;
    }

    public boolean vdvldrhtss() {
        return this.f24952zdlpuopuiu instanceof Number;
    }

    public int wflxmlrfwp() {
        return vdvldrhtss() ? agtfadlqog().intValue() : Integer.parseInt(gxszxtbevo());
    }

    public gtknphoqwx(Number number) {
        Objects.requireNonNull(number);
        this.f24952zdlpuopuiu = number;
    }

    public gtknphoqwx(String str) {
        Objects.requireNonNull(str);
        this.f24952zdlpuopuiu = str;
    }
}
