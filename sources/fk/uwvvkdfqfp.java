package fk;

/* JADX INFO: loaded from: classes3.dex */
public final class uwvvkdfqfp extends hkdspvbjdz {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final dk.gxszxtbevo f34243ppxfxbqfkf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwvvkdfqfp(final bk.zoijcleaow keySerializer, final bk.zoijcleaow valueSerializer) {
        super(keySerializer, valueSerializer, null);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(keySerializer, "keySerializer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(valueSerializer, "valueSerializer");
        this.f34243ppxfxbqfkf = dk.wflxmlrfwp.wkgbmnqykc("kotlin.Pair", new dk.gxszxtbevo[0], new tg.draadjrbmk() { // from class: fk.czzsidtyhn
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return uwvvkdfqfp.draadjrbmk(keySerializer, valueSerializer, (dk.iobyxmoadg) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn draadjrbmk(bk.zoijcleaow zoijcleaowVar, bk.zoijcleaow zoijcleaowVar2, dk.iobyxmoadg buildClassSerialDescriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        dk.iobyxmoadg.zoijcleaow(buildClassSerialDescriptor, "first", zoijcleaowVar.iobyxmoadg(), null, false, 12, null);
        dk.iobyxmoadg.zoijcleaow(buildClassSerialDescriptor, "second", zoijcleaowVar2.iobyxmoadg(), null, false, 12, null);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.hkdspvbjdz
    /* JADX INFO: renamed from: agtfadlqog, reason: merged with bridge method [inline-methods] */
    public Object nufgyqmvbu(gg.vdvldrhtss vdvldrhtssVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(vdvldrhtssVar, "<this>");
        return vdvldrhtssVar.nufgyqmvbu();
    }

    @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
    public dk.gxszxtbevo iobyxmoadg() {
        return this.f34243ppxfxbqfkf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.hkdspvbjdz
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public gg.vdvldrhtss btonecajqb(Object obj, Object obj2) {
        return gg.cqumvgiudr.iobyxmoadg(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.hkdspvbjdz
    /* JADX INFO: renamed from: wflxmlrfwp, reason: merged with bridge method [inline-methods] */
    public Object gxszxtbevo(gg.vdvldrhtss vdvldrhtssVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(vdvldrhtssVar, "<this>");
        return vdvldrhtssVar.lqeggnwhkg();
    }
}
