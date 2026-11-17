package androidx.compose.ui.layout;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf extends esjtqupxsv {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f6542zoijcleaow = new iobyxmoadg(null);

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: androidx.compose.ui.layout.ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C0112iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ ppxfxbqfkf[] f6543zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0112iobyxmoadg(ppxfxbqfkf[] ppxfxbqfkfVarArr) {
                super(2);
                this.f6543zdlpuopuiu = ppxfxbqfkfVarArr;
            }

            @Override // tg.rgvfuqvkyq
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return iobyxmoadg((kcexrzcfyt.iobyxmoadg) obj, ((Number) obj2).floatValue());
            }

            public final Float iobyxmoadg(kcexrzcfyt.iobyxmoadg iobyxmoadgVar, float f13) {
                return Float.valueOf(lereixgezr.zoijcleaow(iobyxmoadgVar, true, this.f6543zdlpuopuiu, f13));
            }
        }

        static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ ppxfxbqfkf[] f6544zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            zoijcleaow(ppxfxbqfkf[] ppxfxbqfkfVarArr) {
                super(2);
                this.f6544zdlpuopuiu = ppxfxbqfkfVarArr;
            }

            @Override // tg.rgvfuqvkyq
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return iobyxmoadg((kcexrzcfyt.iobyxmoadg) obj, ((Number) obj2).floatValue());
            }

            public final Float iobyxmoadg(kcexrzcfyt.iobyxmoadg iobyxmoadgVar, float f13) {
                return Float.valueOf(lereixgezr.zoijcleaow(iobyxmoadgVar, false, this.f6544zdlpuopuiu, f13));
            }
        }

        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ppxfxbqfkf iobyxmoadg(ppxfxbqfkf... ppxfxbqfkfVarArr) {
            return new ppxfxbqfkf(new C0112iobyxmoadg(ppxfxbqfkfVarArr), null);
        }

        public final ppxfxbqfkf zoijcleaow(ppxfxbqfkf... ppxfxbqfkfVarArr) {
            return new ppxfxbqfkf(new zoijcleaow(ppxfxbqfkfVarArr), null);
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ ppxfxbqfkf(tg.rgvfuqvkyq rgvfuqvkyqVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(rgvfuqvkyqVar);
    }

    @Override // androidx.compose.ui.layout.esjtqupxsv
    public float iobyxmoadg(float f13, x.rgvfuqvkyq rgvfuqvkyqVar, x.rgvfuqvkyq rgvfuqvkyqVar2) {
        return Float.intBitsToFloat((int) (rgvfuqvkyqVar2.oipsdeybqn(rgvfuqvkyqVar, g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(((int) (rgvfuqvkyqVar.iobyxmoadg() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L))) & 4294967295L));
    }

    private ppxfxbqfkf(tg.rgvfuqvkyq rgvfuqvkyqVar) {
        super(rgvfuqvkyqVar, null);
    }

    public ppxfxbqfkf() {
        this(null);
    }
}
