package fk;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public final class okpsazkaxt implements bk.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final okpsazkaxt f34215iobyxmoadg = new okpsazkaxt();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final dk.gxszxtbevo f34216zoijcleaow = ikoacuggdj.f34150iobyxmoadg;

    private okpsazkaxt() {
    }

    @Override // bk.iobyxmoadg
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public Void zoijcleaow(ek.eablkybsjg decoder) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }

    @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
    public dk.gxszxtbevo iobyxmoadg() {
        return f34216zoijcleaow;
    }

    @Override // bk.agtfadlqog
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public void wkgbmnqykc(ek.gxszxtbevo encoder, Void value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encoder, "encoder");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }
}
