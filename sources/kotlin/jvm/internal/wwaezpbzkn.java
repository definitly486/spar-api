package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wwaezpbzkn extends gxszxtbevo implements ah.gtknphoqwx {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final boolean f60037zdlpuopuiu;

    public wwaezpbzkn() {
        this.f60037zdlpuopuiu = false;
    }

    @Override // kotlin.jvm.internal.gxszxtbevo
    public ah.ppxfxbqfkf compute() {
        return this.f60037zdlpuopuiu ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wwaezpbzkn) {
            wwaezpbzkn wwaezpbzknVar = (wwaezpbzkn) obj;
            return getOwner().equals(wwaezpbzknVar.getOwner()) && getName().equals(wwaezpbzknVar.getName()) && getSignature().equals(wwaezpbzknVar.getSignature()) && zdlpuopuiu.eablkybsjg(getBoundReceiver(), wwaezpbzknVar.getBoundReceiver());
        }
        if (obj instanceof ah.gtknphoqwx) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.gxszxtbevo
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public ah.gtknphoqwx getReflected() {
        if (this.f60037zdlpuopuiu) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (ah.gtknphoqwx) super.getReflected();
    }

    public String toString() {
        ah.ppxfxbqfkf ppxfxbqfkfVarCompute = compute();
        if (ppxfxbqfkfVarCompute != this) {
            return ppxfxbqfkfVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public wwaezpbzkn(Object obj, Class cls, String str, String str2, int i13) {
        super(obj, cls, str, str2, (i13 & 1) == 1);
        this.f60037zdlpuopuiu = (i13 & 2) == 2;
    }
}
