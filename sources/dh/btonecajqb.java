package dh;

/* JADX INFO: loaded from: classes3.dex */
public class btonecajqb extends mh.ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ikoacuggdj f28175iobyxmoadg;

    public btonecajqb(ikoacuggdj container) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "container");
        this.f28175iobyxmoadg = container;
    }

    @Override // mh.ojitshcjhn, jh.ojitshcjhn
    /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
    public pmvmpeiblj wflxmlrfwp(jh.lereixgezr descriptor, gg.wwaezpbzkn data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        return new rlfsiqarku(this.f28175iobyxmoadg, descriptor);
    }

    @Override // jh.ojitshcjhn
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public pmvmpeiblj nufgyqmvbu(jh.crxdokpmqz descriptor, gg.wwaezpbzkn data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        int i13 = (descriptor.hcddaimhww() != null ? 1 : 0) + (descriptor.hkdspvbjdz() != null ? 1 : 0);
        if (descriptor.jpowsppfya()) {
            if (i13 == 0) {
                return new uwvvkdfqfp(this.f28175iobyxmoadg, descriptor);
            }
            if (i13 == 1) {
                return new ydmasvzmpa(this.f28175iobyxmoadg, descriptor);
            }
            if (i13 == 2) {
                return new zfvoamnweg(this.f28175iobyxmoadg, descriptor);
            }
        } else {
            if (i13 == 0) {
                return new iwxlajgraz(this.f28175iobyxmoadg, descriptor);
            }
            if (i13 == 1) {
                return new igdgnonuha(this.f28175iobyxmoadg, descriptor);
            }
            if (i13 == 2) {
                return new hszhottldk(this.f28175iobyxmoadg, descriptor);
            }
        }
        throw new c("Unsupported property: " + descriptor);
    }
}
