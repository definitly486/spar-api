package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gxszxtbevo implements ah.ppxfxbqfkf, Serializable {
    public static final Object NO_RECEIVER = iobyxmoadg.f60013zdlpuopuiu;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient ah.ppxfxbqfkf reflected;
    private final String signature;

    private static class iobyxmoadg implements Serializable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private static final iobyxmoadg f60013zdlpuopuiu = new iobyxmoadg();

        private iobyxmoadg() {
        }

        private Object readResolve() throws ObjectStreamException {
            return f60013zdlpuopuiu;
        }
    }

    public gxszxtbevo() {
        this(NO_RECEIVER);
    }

    @Override // ah.ppxfxbqfkf
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // ah.ppxfxbqfkf
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public ah.ppxfxbqfkf compute() {
        ah.ppxfxbqfkf ppxfxbqfkfVar = this.reflected;
        if (ppxfxbqfkfVar != null) {
            return ppxfxbqfkfVar;
        }
        ah.ppxfxbqfkf ppxfxbqfkfVarComputeReflected = computeReflected();
        this.reflected = ppxfxbqfkfVarComputeReflected;
        return ppxfxbqfkfVarComputeReflected;
    }

    protected abstract ah.ppxfxbqfkf computeReflected();

    @Override // ah.zoijcleaow
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // ah.ppxfxbqfkf
    public String getName() {
        return this.name;
    }

    public ah.gxszxtbevo getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? cllcsxoeiz.ppxfxbqfkf(cls) : cllcsxoeiz.zoijcleaow(cls);
    }

    @Override // ah.ppxfxbqfkf
    public List<ah.btonecajqb> getParameters() {
        return getReflected().getParameters();
    }

    protected ah.ppxfxbqfkf getReflected() {
        ah.ppxfxbqfkf ppxfxbqfkfVarCompute = compute();
        if (ppxfxbqfkfVarCompute != this) {
            return ppxfxbqfkfVarCompute;
        }
        throw new sg.zoijcleaow();
    }

    @Override // ah.ppxfxbqfkf
    public ah.ojitshcjhn getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // ah.ppxfxbqfkf
    public List<ah.rgvfuqvkyq> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // ah.ppxfxbqfkf
    public ah.kcexrzcfyt getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // ah.ppxfxbqfkf
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // ah.ppxfxbqfkf
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // ah.ppxfxbqfkf
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    protected gxszxtbevo(Object obj) {
        this(obj, null, null, null, false);
    }

    protected gxszxtbevo(Object obj, Class cls, String str, String str2, boolean z13) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z13;
    }
}
