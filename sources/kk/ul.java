package kk;

import spay.sdk.domain.model.BiometricSuggestionModel;

/* JADX INFO: loaded from: classes3.dex */
public final class ul extends nr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final BiometricSuggestionModel f58866iobyxmoadg;

    public ul(BiometricSuggestionModel biometricSuggestionModel) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(biometricSuggestionModel, "biometricSuggestionModel");
        this.f58866iobyxmoadg = biometricSuggestionModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ul) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58866iobyxmoadg, ((ul) obj).f58866iobyxmoadg);
    }

    public final int hashCode() {
        return this.f58866iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "ShowBiometricSuggestionAlert(biometricSuggestionModel=" + this.f58866iobyxmoadg + ")";
    }
}
