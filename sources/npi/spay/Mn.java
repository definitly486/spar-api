package npi.spay;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class Mn extends IllegalStateException {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final String f70556zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mn(String state) {
        super("Wrong Outcome state: " + state);
        zdlpuopuiu.btonecajqb(state, "state");
        this.f70556zdlpuopuiu = state;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Mn) && zdlpuopuiu.eablkybsjg(this.f70556zdlpuopuiu, ((Mn) obj).f70556zdlpuopuiu);
    }

    public final int hashCode() {
        return this.f70556zdlpuopuiu.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "WrongOutcomeState(state=" + this.f70556zdlpuopuiu + ")";
    }
}
