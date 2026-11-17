package hk;

/* JADX INFO: loaded from: classes3.dex */
public final class vdvldrhtss {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final fk.iwizpuwonk f40546iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f40547zoijcleaow;

    /* synthetic */ class iobyxmoadg extends kotlin.jvm.internal.vdvldrhtss implements tg.rgvfuqvkyq {
        iobyxmoadg(Object obj) {
            super(2, obj, vdvldrhtss.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return iobyxmoadg((dk.gxszxtbevo) obj, ((Number) obj2).intValue());
        }

        public final Boolean iobyxmoadg(dk.gxszxtbevo p13, int i13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return Boolean.valueOf(((vdvldrhtss) this.receiver).eablkybsjg(p13, i13));
        }
    }

    public vdvldrhtss(dk.gxszxtbevo descriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        this.f40546iobyxmoadg = new fk.iwizpuwonk(descriptor, new iobyxmoadg(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean eablkybsjg(dk.gxszxtbevo gxszxtbevoVar, int i13) {
        boolean z13 = !gxszxtbevoVar.dxjokdxxww(i13) && gxszxtbevoVar.lqeggnwhkg(i13).zoijcleaow();
        this.f40547zoijcleaow = z13;
        return z13;
    }

    public final void ppxfxbqfkf(int i13) {
        this.f40546iobyxmoadg.iobyxmoadg(i13);
    }

    public final int wkgbmnqykc() {
        return this.f40546iobyxmoadg.wkgbmnqykc();
    }

    public final boolean zoijcleaow() {
        return this.f40547zoijcleaow;
    }
}
