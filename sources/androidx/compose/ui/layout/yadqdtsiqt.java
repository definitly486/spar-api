package androidx.compose.ui.layout;

/* JADX INFO: loaded from: classes.dex */
public final class yadqdtsiqt extends esjtqupxsv {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f6557zoijcleaow = new iobyxmoadg(null);

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: androidx.compose.ui.layout.yadqdtsiqt$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C0113iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ yadqdtsiqt[] f6558zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0113iobyxmoadg(yadqdtsiqt[] yadqdtsiqtVarArr) {
                super(2);
                this.f6558zdlpuopuiu = yadqdtsiqtVarArr;
            }

            @Override // tg.rgvfuqvkyq
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return iobyxmoadg((kcexrzcfyt.iobyxmoadg) obj, ((Number) obj2).floatValue());
            }

            public final Float iobyxmoadg(kcexrzcfyt.iobyxmoadg iobyxmoadgVar, float f13) {
                return Float.valueOf(lereixgezr.zoijcleaow(iobyxmoadgVar, true, this.f6558zdlpuopuiu, f13));
            }
        }

        static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ yadqdtsiqt[] f6559zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            zoijcleaow(yadqdtsiqt[] yadqdtsiqtVarArr) {
                super(2);
                this.f6559zdlpuopuiu = yadqdtsiqtVarArr;
            }

            @Override // tg.rgvfuqvkyq
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return iobyxmoadg((kcexrzcfyt.iobyxmoadg) obj, ((Number) obj2).floatValue());
            }

            public final Float iobyxmoadg(kcexrzcfyt.iobyxmoadg iobyxmoadgVar, float f13) {
                return Float.valueOf(lereixgezr.zoijcleaow(iobyxmoadgVar, false, this.f6559zdlpuopuiu, f13));
            }
        }

        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final yadqdtsiqt iobyxmoadg(tg.rgvfuqvkyq rgvfuqvkyqVar) {
            return new yadqdtsiqt(rgvfuqvkyqVar, null);
        }

        public final yadqdtsiqt ppxfxbqfkf(yadqdtsiqt... yadqdtsiqtVarArr) {
            return iobyxmoadg(new zoijcleaow(yadqdtsiqtVarArr));
        }

        public final yadqdtsiqt zoijcleaow(yadqdtsiqt... yadqdtsiqtVarArr) {
            return iobyxmoadg(new C0113iobyxmoadg(yadqdtsiqtVarArr));
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ yadqdtsiqt(tg.rgvfuqvkyq rgvfuqvkyqVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(rgvfuqvkyqVar);
    }

    @Override // androidx.compose.ui.layout.esjtqupxsv
    public float iobyxmoadg(float f13, x.rgvfuqvkyq rgvfuqvkyqVar, x.rgvfuqvkyq rgvfuqvkyqVar2) {
        return Float.intBitsToFloat((int) (rgvfuqvkyqVar2.oipsdeybqn(rgvfuqvkyqVar, g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(((int) (rgvfuqvkyqVar.iobyxmoadg() & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32))) >> 32));
    }

    private yadqdtsiqt(tg.rgvfuqvkyq rgvfuqvkyqVar) {
        super(rgvfuqvkyqVar, null);
    }

    public yadqdtsiqt() {
        this(null);
    }
}
