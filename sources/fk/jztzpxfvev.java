package fk;

/* JADX INFO: loaded from: classes3.dex */
public final class jztzpxfvev implements bk.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final bk.zoijcleaow f34189iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final dk.gxszxtbevo f34190zoijcleaow;

    public jztzpxfvev(bk.zoijcleaow serializer) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(serializer, "serializer");
        this.f34189iobyxmoadg = serializer;
        this.f34190zoijcleaow = new iwxlajgraz(serializer.iobyxmoadg());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && jztzpxfvev.class == obj.getClass() && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34189iobyxmoadg, ((jztzpxfvev) obj).f34189iobyxmoadg);
    }

    public int hashCode() {
        return this.f34189iobyxmoadg.hashCode();
    }

    @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
    public dk.gxszxtbevo iobyxmoadg() {
        return this.f34190zoijcleaow;
    }

    @Override // bk.agtfadlqog
    public void wkgbmnqykc(ek.gxszxtbevo encoder, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encoder, "encoder");
        if (obj == null) {
            encoder.jyumaefscl();
        } else {
            encoder.zynmafqrjb();
            encoder.rgvfuqvkyq(this.f34189iobyxmoadg, obj);
        }
    }

    @Override // bk.iobyxmoadg
    public Object zoijcleaow(ek.eablkybsjg decoder) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
        return decoder.cdpycssgdh() ? decoder.eablkybsjg(this.f34189iobyxmoadg) : decoder.gtknphoqwx();
    }
}
