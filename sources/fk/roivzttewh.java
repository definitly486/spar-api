package fk;

import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes3.dex */
public final class roivzttewh implements dk.gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f34229iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final dk.eablkybsjg f34230zoijcleaow;

    public roivzttewh(String serialName, dk.eablkybsjg kind) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(serialName, "serialName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kind, "kind");
        this.f34229iobyxmoadg = serialName;
        this.f34230zoijcleaow = kind;
    }

    private final Void iobyxmoadg() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // dk.gxszxtbevo
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public dk.eablkybsjg getKind() {
        return this.f34230zoijcleaow;
    }

    @Override // dk.gxszxtbevo
    public boolean dxjokdxxww(int i13) {
        iobyxmoadg();
        throw new KotlinNothingValueException();
    }

    @Override // dk.gxszxtbevo
    public String eablkybsjg(int i13) {
        iobyxmoadg();
        throw new KotlinNothingValueException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof roivzttewh)) {
            return false;
        }
        roivzttewh roivzttewhVar = (roivzttewh) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(nufgyqmvbu(), roivzttewhVar.nufgyqmvbu()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(getKind(), roivzttewhVar.getKind());
    }

    @Override // dk.gxszxtbevo
    public List getAnnotations() {
        return dk.gxszxtbevo.iobyxmoadg.iobyxmoadg(this);
    }

    @Override // dk.gxszxtbevo
    public List gxszxtbevo(int i13) {
        iobyxmoadg();
        throw new KotlinNothingValueException();
    }

    public int hashCode() {
        return nufgyqmvbu().hashCode() + (getKind().hashCode() * 31);
    }

    @Override // dk.gxszxtbevo
    public boolean isInline() {
        return dk.gxszxtbevo.iobyxmoadg.zoijcleaow(this);
    }

    @Override // dk.gxszxtbevo
    public dk.gxszxtbevo lqeggnwhkg(int i13) {
        iobyxmoadg();
        throw new KotlinNothingValueException();
    }

    @Override // dk.gxszxtbevo
    public String nufgyqmvbu() {
        return this.f34229iobyxmoadg;
    }

    @Override // dk.gxszxtbevo
    public int ppxfxbqfkf(String name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        iobyxmoadg();
        throw new KotlinNothingValueException();
    }

    public String toString() {
        return "PrimitiveDescriptor(" + nufgyqmvbu() + ')';
    }

    @Override // dk.gxszxtbevo
    public int wkgbmnqykc() {
        return 0;
    }

    @Override // dk.gxszxtbevo
    public boolean zoijcleaow() {
        return dk.gxszxtbevo.iobyxmoadg.ppxfxbqfkf(this);
    }
}
