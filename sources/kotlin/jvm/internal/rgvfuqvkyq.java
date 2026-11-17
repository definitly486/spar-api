package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rgvfuqvkyq extends gxszxtbevo implements ojitshcjhn, ah.lqeggnwhkg {
    private final int arity;
    private final int flags;

    public rgvfuqvkyq(int i13) {
        this(i13, gxszxtbevo.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.gxszxtbevo
    protected ah.ppxfxbqfkf computeReflected() {
        return cllcsxoeiz.iobyxmoadg(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rgvfuqvkyq) {
            rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) obj;
            return getName().equals(rgvfuqvkyqVar.getName()) && getSignature().equals(rgvfuqvkyqVar.getSignature()) && this.flags == rgvfuqvkyqVar.flags && this.arity == rgvfuqvkyqVar.arity && zdlpuopuiu.eablkybsjg(getBoundReceiver(), rgvfuqvkyqVar.getBoundReceiver()) && zdlpuopuiu.eablkybsjg(getOwner(), rgvfuqvkyqVar.getOwner());
        }
        if (obj instanceof ah.lqeggnwhkg) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.ojitshcjhn
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // ah.lqeggnwhkg
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // ah.lqeggnwhkg
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // ah.lqeggnwhkg
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // ah.lqeggnwhkg
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // ah.ppxfxbqfkf
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        ah.ppxfxbqfkf ppxfxbqfkfVarCompute = compute();
        if (ppxfxbqfkfVarCompute != this) {
            return ppxfxbqfkfVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public rgvfuqvkyq(int i13, Object obj) {
        this(i13, obj, null, null, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.gxszxtbevo
    public ah.lqeggnwhkg getReflected() {
        return (ah.lqeggnwhkg) super.getReflected();
    }

    public rgvfuqvkyq(int i13, Object obj, Class cls, String str, String str2, int i14) {
        super(obj, cls, str, str2, (i14 & 1) == 1);
        this.arity = i13;
        this.flags = i14 >> 1;
    }
}
