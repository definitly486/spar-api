package ff;

import bk.agtfadlqog;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cqumvgiudr;
import lk.istkbnxepw;
import lm.gxszxtbevo;

/* JADX INFO: loaded from: classes2.dex */
public final class wkgbmnqykc implements gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final cqumvgiudr f33540iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final eablkybsjg f33541ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final agtfadlqog f33542zoijcleaow;

    public wkgbmnqykc(cqumvgiudr contentType, agtfadlqog saver, eablkybsjg serializer) {
        zdlpuopuiu.btonecajqb(contentType, "contentType");
        zdlpuopuiu.btonecajqb(saver, "saver");
        zdlpuopuiu.btonecajqb(serializer, "serializer");
        this.f33540iobyxmoadg = contentType;
        this.f33542zoijcleaow = saver;
        this.f33541ppxfxbqfkf = serializer;
    }

    @Override // lm.gxszxtbevo
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public istkbnxepw convert(Object obj) {
        return this.f33541ppxfxbqfkf.wkgbmnqykc(this.f33540iobyxmoadg, this.f33542zoijcleaow, obj);
    }
}
