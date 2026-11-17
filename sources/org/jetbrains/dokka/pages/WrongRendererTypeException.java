package org.jetbrains.dokka.pages;

import ah.wkgbmnqykc;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lorg/jetbrains/dokka/pages/WrongRendererTypeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lah/wkgbmnqykc;", "zdlpuopuiu", "Lah/wkgbmnqykc;", "getExpectedType", "()Lah/wkgbmnqykc;", "expectedType", "core"}, k = 1, mv = {1, 4, 3})
public final /* data */ class WrongRendererTypeException extends Exception {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final wkgbmnqykc expectedType;

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof WrongRendererTypeException) && zdlpuopuiu.eablkybsjg(this.expectedType, ((WrongRendererTypeException) other).expectedType);
        }
        return true;
    }

    public int hashCode() {
        wkgbmnqykc wkgbmnqykcVar = this.expectedType;
        if (wkgbmnqykcVar != null) {
            return wkgbmnqykcVar.hashCode();
        }
        return 0;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "WrongRendererTypeException(expectedType=" + this.expectedType + ")";
    }
}
