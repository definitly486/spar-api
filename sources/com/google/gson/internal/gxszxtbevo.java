package com.google.gson.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo extends Number {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f25116zdlpuopuiu;

    public gxszxtbevo(String str) {
        this.f25116zdlpuopuiu = str;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new BigDecimal(this.f25116zdlpuopuiu);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f25116zdlpuopuiu);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        String str = this.f25116zdlpuopuiu;
        String str2 = ((gxszxtbevo) obj).f25116zdlpuopuiu;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f25116zdlpuopuiu);
    }

    public int hashCode() {
        return this.f25116zdlpuopuiu.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f25116zdlpuopuiu);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f25116zdlpuopuiu);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f25116zdlpuopuiu).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f25116zdlpuopuiu);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f25116zdlpuopuiu).longValue();
        }
    }

    public String toString() {
        return this.f25116zdlpuopuiu;
    }
}
