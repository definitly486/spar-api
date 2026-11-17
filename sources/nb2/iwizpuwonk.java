package nb2;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class iwizpuwonk {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f69572ppxfxbqfkf = new iobyxmoadg();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static iwizpuwonk f69573wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final zdlpuopuiu f69574iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final mb2.zoijcleaow f69575zoijcleaow;

    public static final class iobyxmoadg {
        public final iwizpuwonk iobyxmoadg(Context context) {
            iwizpuwonk iwizpuwonkVar;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
            synchronized (this) {
                iwizpuwonkVar = iwizpuwonk.f69573wkgbmnqykc;
                if (iwizpuwonkVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(applicationContext, "context.applicationContext");
                    iwizpuwonkVar = new iwizpuwonk(applicationContext);
                    iwizpuwonk.f69573wkgbmnqykc = iwizpuwonkVar;
                }
            }
            return iwizpuwonkVar;
        }
    }

    public static final class zoijcleaow implements hkdspvbjdz {
        @Override // nb2.hkdspvbjdz
        public final void iobyxmoadg(tg.iobyxmoadg messageBuilder) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(messageBuilder, "messageBuilder");
        }
    }

    public iwizpuwonk(Context context) {
        lereixgezr lereixgezrVar = new lereixgezr();
        zoijcleaow zoijcleaowVar = new zoijcleaow();
        cqumvgiudr cqumvgiudrVar = new cqumvgiudr(context);
        agtfadlqog agtfadlqogVar = new agtfadlqog(new dxjokdxxww(new ntlheqmsrt(context, new nb2.zoijcleaow(new okpsazkaxt(), new jztzpxfvev(), new metgxyhuhe(new pmvmpeiblj()), new nb2.iobyxmoadg())), zoijcleaowVar), new gtknphoqwx(new vipkmwdibw(), new yadqdtsiqt()), new draadjrbmk(new vipkmwdibw()), zoijcleaowVar);
        zdlpuopuiu zdlpuopuiuVar = new zdlpuopuiu(agtfadlqogVar, new kcexrzcfyt(agtfadlqogVar, new oxmwwwfdhm(new istkbnxepw(cqumvgiudrVar, new yadqdtsiqt()), new ppxfxbqfkf(context), new ojitshcjhn(new ribwqtqdhb(new cdpycssgdh(), new vdvldrhtss(), zoijcleaowVar)), new ylkuphrtab(context))));
        this.f69574iobyxmoadg = zdlpuopuiuVar;
        this.f69575zoijcleaow = new mb2.zoijcleaow(new mbcevpiqjq(zdlpuopuiuVar, new iozdgvuglv(agtfadlqogVar), new yggfygwlhe(context, new wwaezpbzkn(new jpowsppfya(new pkzmftpjix()))), lereixgezrVar, zoijcleaowVar));
    }
}
