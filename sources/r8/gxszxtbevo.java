package r8;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo implements agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f82051iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final eablkybsjg f82052zoijcleaow;

    private interface eablkybsjg {
        Class iobyxmoadg();

        Object ppxfxbqfkf(Resources.Theme theme, Resources resources, int i13);

        void zoijcleaow(Object obj);
    }

    private static final class iobyxmoadg implements ojitshcjhn, eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Context f82053iobyxmoadg;

        iobyxmoadg(Context context) {
            this.f82053iobyxmoadg = context;
        }

        @Override // r8.ojitshcjhn
        public void eablkybsjg() {
        }

        @Override // r8.gxszxtbevo.eablkybsjg
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public void zoijcleaow(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // r8.gxszxtbevo.eablkybsjg
        public Class iobyxmoadg() {
            return AssetFileDescriptor.class;
        }

        @Override // r8.gxszxtbevo.eablkybsjg
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public AssetFileDescriptor ppxfxbqfkf(Resources.Theme theme, Resources resources, int i13) {
            return resources.openRawResourceFd(i13);
        }

        @Override // r8.ojitshcjhn
        public agtfadlqog wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar) {
            return new gxszxtbevo(this.f82053iobyxmoadg, this);
        }
    }

    private static final class ppxfxbqfkf implements ojitshcjhn, eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Context f82054iobyxmoadg;

        ppxfxbqfkf(Context context) {
            this.f82054iobyxmoadg = context;
        }

        @Override // r8.ojitshcjhn
        public void eablkybsjg() {
        }

        @Override // r8.gxszxtbevo.eablkybsjg
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public void zoijcleaow(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // r8.gxszxtbevo.eablkybsjg
        public Class iobyxmoadg() {
            return InputStream.class;
        }

        @Override // r8.gxszxtbevo.eablkybsjg
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public InputStream ppxfxbqfkf(Resources.Theme theme, Resources resources, int i13) {
            return resources.openRawResource(i13);
        }

        @Override // r8.ojitshcjhn
        public agtfadlqog wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar) {
            return new gxszxtbevo(this.f82054iobyxmoadg, this);
        }
    }

    private static final class wkgbmnqykc implements com.bumptech.glide.load.data.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private Object f82055cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final int f82056iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final eablkybsjg f82057jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final Resources f82058yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Resources.Theme f82059zdlpuopuiu;

        wkgbmnqykc(Resources.Theme theme, Resources resources, eablkybsjg eablkybsjgVar, int i13) {
            this.f82059zdlpuopuiu = theme;
            this.f82058yggfygwlhe = resources;
            this.f82057jyumaefscl = eablkybsjgVar;
            this.f82056iwizpuwonk = i13;
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public void eablkybsjg(com.bumptech.glide.btonecajqb btonecajqbVar, com.bumptech.glide.load.data.wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
            try {
                Object objPpxfxbqfkf = this.f82057jyumaefscl.ppxfxbqfkf(this.f82059zdlpuopuiu, this.f82058yggfygwlhe, this.f82056iwizpuwonk);
                this.f82055cqumvgiudr = objPpxfxbqfkf;
                iobyxmoadgVar.gxszxtbevo(objPpxfxbqfkf);
            } catch (Resources.NotFoundException e13) {
                iobyxmoadgVar.ppxfxbqfkf(e13);
            }
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public Class iobyxmoadg() {
            return this.f82057jyumaefscl.iobyxmoadg();
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public l8.iobyxmoadg wkgbmnqykc() {
            return l8.iobyxmoadg.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public void zoijcleaow() {
            Object obj = this.f82055cqumvgiudr;
            if (obj != null) {
                try {
                    this.f82057jyumaefscl.zoijcleaow(obj);
                } catch (IOException unused) {
                }
            }
        }
    }

    private static final class zoijcleaow implements ojitshcjhn, eablkybsjg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Context f82060iobyxmoadg;

        zoijcleaow(Context context) {
            this.f82060iobyxmoadg = context;
        }

        @Override // r8.ojitshcjhn
        public void eablkybsjg() {
        }

        @Override // r8.gxszxtbevo.eablkybsjg
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public void zoijcleaow(Drawable drawable) {
        }

        @Override // r8.gxszxtbevo.eablkybsjg
        public Class iobyxmoadg() {
            return Drawable.class;
        }

        @Override // r8.gxszxtbevo.eablkybsjg
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public Drawable ppxfxbqfkf(Resources.Theme theme, Resources resources, int i13) {
            return v8.dxjokdxxww.iobyxmoadg(this.f82060iobyxmoadg, i13, theme);
        }

        @Override // r8.ojitshcjhn
        public agtfadlqog wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar) {
            return new gxszxtbevo(this.f82060iobyxmoadg, this);
        }
    }

    gxszxtbevo(Context context, eablkybsjg eablkybsjgVar) {
        this.f82051iobyxmoadg = context.getApplicationContext();
        this.f82052zoijcleaow = eablkybsjgVar;
    }

    public static ojitshcjhn eablkybsjg(Context context) {
        return new zoijcleaow(context);
    }

    public static ojitshcjhn lqeggnwhkg(Context context) {
        return new ppxfxbqfkf(context);
    }

    public static ojitshcjhn ppxfxbqfkf(Context context) {
        return new iobyxmoadg(context);
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(Integer num) {
        return true;
    }

    @Override // r8.agtfadlqog
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public agtfadlqog.iobyxmoadg zoijcleaow(Integer num, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        Resources.Theme theme = (Resources.Theme) lqeggnwhkgVar.ppxfxbqfkf(v8.wflxmlrfwp.f116319zoijcleaow);
        return new agtfadlqog.iobyxmoadg(new f9.wkgbmnqykc(num), new wkgbmnqykc(theme, theme != null ? theme.getResources() : this.f82051iobyxmoadg.getResources(), this.f82052zoijcleaow, num.intValue()));
    }
}
