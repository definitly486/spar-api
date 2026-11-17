package npi.spay;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class An extends RuntimeException {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final String f70537zdlpuopuiu;

    public An(String str) {
        super("Error at BMS SDK initialization: " + str);
        this.f70537zdlpuopuiu = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof An) && zdlpuopuiu.eablkybsjg(this.f70537zdlpuopuiu, ((An) obj).f70537zdlpuopuiu);
    }

    public final int hashCode() {
        String str = this.f70537zdlpuopuiu;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "BizoneInitializationException(reason=" + this.f70537zdlpuopuiu + ")";
    }
}
