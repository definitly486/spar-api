package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.AttachedSurfaceControl;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import v2.jpowsppfya;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public class PlayerView extends FrameLayout {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final TextView f11722cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private androidx.media3.ui.wkgbmnqykc.wflxmlrfwp f11723cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final boolean f11724cqumvgiudr;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private boolean f11725crxdokpmqz;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private int f11726dsvhmnatus;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final gxszxtbevo f11727esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final Object f11728hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private boolean f11729hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final FrameLayout f11730iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final View f11731istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final View f11732iwizpuwonk;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private boolean f11733jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private v2.esjtqupxsv f11734jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final View f11735jyumaefscl;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private int f11736kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final ImageView f11737lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final FrameLayout f11738lmojexxdyd;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private CharSequence f11739mbcevpiqjq;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private int f11740ntlheqmsrt;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private final Method f11741pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final ImageView f11742pmvmpeiblj;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private boolean f11743sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private Drawable f11744stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private boolean f11745tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private boolean f11746ulzqkzuiru;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private final Handler f11747wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private int f11748wypolnanlu;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final androidx.media3.ui.wkgbmnqykc f11749yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final AspectRatioFrameLayout f11750yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private final Class f11751ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ppxfxbqfkf f11752zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final SubtitleView f11753zynmafqrjb;

    public interface eablkybsjg {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        SurfaceSyncGroup f11754iobyxmoadg;

        private gxszxtbevo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void ppxfxbqfkf() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void wkgbmnqykc(SurfaceView surfaceView, Runnable runnable) {
            AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
            if (rootSurfaceControl == null) {
                return;
            }
            SurfaceSyncGroup surfaceSyncGroupIobyxmoadg = d5.agtfadlqog.iobyxmoadg("exo-sync-b-334901521");
            this.f11754iobyxmoadg = surfaceSyncGroupIobyxmoadg;
            y2.iobyxmoadg.lqeggnwhkg(surfaceSyncGroupIobyxmoadg.add(rootSurfaceControl, new Runnable() { // from class: androidx.media3.ui.esjtqupxsv
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerView.gxszxtbevo.ppxfxbqfkf();
                }
            }));
            runnable.run();
            rootSurfaceControl.applyTransactionOnDraw(d5.ojitshcjhn.iobyxmoadg());
        }

        public void eablkybsjg() {
            SurfaceSyncGroup surfaceSyncGroup = this.f11754iobyxmoadg;
            if (surfaceSyncGroup != null) {
                surfaceSyncGroup.markSyncReady();
                this.f11754iobyxmoadg = null;
            }
        }

        public void gxszxtbevo(Handler handler, final SurfaceView surfaceView, final Runnable runnable) {
            handler.post(new Runnable() { // from class: androidx.media3.ui.cqumvgiudr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11788zdlpuopuiu.wkgbmnqykc(surfaceView, runnable);
                }
            });
        }
    }

    private final class ppxfxbqfkf implements v2.esjtqupxsv.wkgbmnqykc, View.OnClickListener, androidx.media3.ui.wkgbmnqykc.wflxmlrfwp, androidx.media3.ui.wkgbmnqykc.InterfaceC0170wkgbmnqykc {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private Object f11756yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final v2.cdpycssgdh.zoijcleaow f11757zdlpuopuiu = new v2.cdpycssgdh.zoijcleaow();

        public ppxfxbqfkf() {
        }

        @Override // v2.esjtqupxsv.wkgbmnqykc
        public void cllcsxoeiz() {
            if (PlayerView.this.f11735jyumaefscl != null) {
                PlayerView.this.f11735jyumaefscl.setVisibility(4);
                if (PlayerView.this.istkbnxepw()) {
                    PlayerView.this.wwaezpbzkn();
                } else {
                    PlayerView.this.yadqdtsiqt();
                }
            }
        }

        @Override // v2.esjtqupxsv.wkgbmnqykc
        public void draadjrbmk(x2.zoijcleaow zoijcleaowVar) {
            if (PlayerView.this.f11753zynmafqrjb != null) {
                PlayerView.this.f11753zynmafqrjb.setCues(zoijcleaowVar.f121003iobyxmoadg);
            }
        }

        @Override // v2.esjtqupxsv.wkgbmnqykc
        public void iozdgvuglv(int i13) {
            PlayerView.this.ribwqtqdhb();
            PlayerView.this.ikoacuggdj();
            PlayerView.this.jhduphickx();
        }

        @Override // androidx.media3.ui.wkgbmnqykc.wflxmlrfwp
        public void istkbnxepw(int i13) {
            PlayerView.this.vipkmwdibw();
            PlayerView.ojitshcjhn(PlayerView.this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlayerView.this.crxdokpmqz();
        }

        @Override // androidx.media3.ui.wkgbmnqykc.InterfaceC0170wkgbmnqykc
        public void pkzmftpjix(boolean z13) {
            PlayerView.rgvfuqvkyq(PlayerView.this);
        }

        @Override // v2.esjtqupxsv.wkgbmnqykc
        public void rlfsiqarku(v2.esjtqupxsv.eablkybsjg eablkybsjgVar, v2.esjtqupxsv.eablkybsjg eablkybsjgVar2, int i13) {
            if (PlayerView.this.hcddaimhww() && PlayerView.this.f11743sopmlzcsov) {
                PlayerView.this.lmojexxdyd();
            }
        }

        @Override // v2.esjtqupxsv.wkgbmnqykc
        public void ulzqkzuiru(int i13, int i14) {
            if (stevsuqkhv.f123602iobyxmoadg == 34 && (PlayerView.this.f11732iwizpuwonk instanceof SurfaceView) && PlayerView.this.f11733jlmebxxoox) {
                gxszxtbevo gxszxtbevoVar = (gxszxtbevo) y2.iobyxmoadg.eablkybsjg(PlayerView.this.f11727esjtqupxsv);
                Handler handler = PlayerView.this.f11747wwaezpbzkn;
                SurfaceView surfaceView = (SurfaceView) PlayerView.this.f11732iwizpuwonk;
                final PlayerView playerView = PlayerView.this;
                gxszxtbevoVar.gxszxtbevo(handler, surfaceView, new Runnable() { // from class: d5.draadjrbmk
                    @Override // java.lang.Runnable
                    public final void run() {
                        playerView.invalidate();
                    }
                });
            }
        }

        @Override // v2.esjtqupxsv.wkgbmnqykc
        public void wypolnanlu(v2.wwaezpbzkn wwaezpbzknVar) {
            v2.esjtqupxsv esjtqupxsvVar = (v2.esjtqupxsv) y2.iobyxmoadg.eablkybsjg(PlayerView.this.f11734jpowsppfya);
            v2.cdpycssgdh cdpycssgdhVarJyumaefscl = esjtqupxsvVar.kcexrzcfyt(17) ? esjtqupxsvVar.jyumaefscl() : v2.cdpycssgdh.f115259iobyxmoadg;
            if (cdpycssgdhVarJyumaefscl.vdvldrhtss()) {
                this.f11756yggfygwlhe = null;
            } else if (!esjtqupxsvVar.kcexrzcfyt(30) || esjtqupxsvVar.ojitshcjhn().zoijcleaow()) {
                Object obj = this.f11756yggfygwlhe;
                if (obj != null) {
                    int iZoijcleaow = cdpycssgdhVarJyumaefscl.zoijcleaow(obj);
                    if (iZoijcleaow != -1) {
                        if (esjtqupxsvVar.mbcevpiqjq() == cdpycssgdhVarJyumaefscl.gxszxtbevo(iZoijcleaow, this.f11757zdlpuopuiu).f115304ppxfxbqfkf) {
                            return;
                        }
                    }
                    this.f11756yggfygwlhe = null;
                }
            } else {
                this.f11756yggfygwlhe = cdpycssgdhVarJyumaefscl.lqeggnwhkg(esjtqupxsvVar.pkzmftpjix(), this.f11757zdlpuopuiu, true).f115306zoijcleaow;
            }
            PlayerView.this.okpsazkaxt(false);
        }

        @Override // v2.esjtqupxsv.wkgbmnqykc
        public void ydmasvzmpa(boolean z13, int i13) {
            PlayerView.this.ribwqtqdhb();
            PlayerView.this.jhduphickx();
        }

        @Override // v2.esjtqupxsv.wkgbmnqykc
        public void zoijcleaow(jpowsppfya jpowsppfyaVar) {
            if (jpowsppfyaVar.equals(jpowsppfya.f115374eablkybsjg) || PlayerView.this.f11734jpowsppfya == null || PlayerView.this.f11734jpowsppfya.tzroggbefp() == 1) {
                return;
            }
            PlayerView.this.jlmebxxoox();
        }
    }

    public interface wkgbmnqykc {
    }

    private static class zoijcleaow {
        public static void iobyxmoadg(SurfaceView surfaceView) {
            surfaceView.setSurfaceLifecycle(2);
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean cdpycssgdh() {
        v2.esjtqupxsv esjtqupxsvVar = this.f11734jpowsppfya;
        return esjtqupxsvVar != null && esjtqupxsvVar.kcexrzcfyt(30) && esjtqupxsvVar.ojitshcjhn().ppxfxbqfkf(2);
    }

    private void cllcsxoeiz(boolean z13) {
        if (!(hcddaimhww() && this.f11743sopmlzcsov) && metgxyhuhe()) {
            boolean z14 = this.f11749yadqdtsiqt.ikoacuggdj() && this.f11749yadqdtsiqt.getShowTimeoutMs() <= 0;
            boolean zMbcevpiqjq = mbcevpiqjq();
            if (z13 || z14 || zMbcevpiqjq) {
                ulzqkzuiru(zMbcevpiqjq);
            }
        }
    }

    private void cqumvgiudr(v2.esjtqupxsv esjtqupxsvVar) {
        Class cls = this.f11751ylkuphrtab;
        if (cls == null || !cls.isAssignableFrom(esjtqupxsvVar.getClass())) {
            return;
        }
        try {
            ((Method) y2.iobyxmoadg.eablkybsjg(this.f11741pkzmftpjix)).invoke(esjtqupxsvVar, null);
        } catch (IllegalAccessException | InvocationTargetException e13) {
            throw new RuntimeException(e13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void crxdokpmqz() {
        if (!metgxyhuhe() || this.f11734jpowsppfya == null) {
            return;
        }
        if (!this.f11749yadqdtsiqt.ikoacuggdj()) {
            cllcsxoeiz(true);
        } else if (this.f11725crxdokpmqz) {
            this.f11749yadqdtsiqt.jlmebxxoox();
        }
    }

    private void esjtqupxsv() {
        View view = this.f11735jyumaefscl;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hcddaimhww() {
        v2.esjtqupxsv esjtqupxsvVar = this.f11734jpowsppfya;
        return esjtqupxsvVar != null && esjtqupxsvVar.kcexrzcfyt(16) && this.f11734jpowsppfya.ppxfxbqfkf() && this.f11734jpowsppfya.iozdgvuglv();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void hkdspvbjdz(Bitmap bitmap) {
        setImage(new BitmapDrawable(getResources(), bitmap));
        if (cdpycssgdh()) {
            return;
        }
        sopmlzcsov();
        esjtqupxsv();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ikoacuggdj() {
        TextView textView = this.f11722cdpycssgdh;
        if (textView != null) {
            CharSequence charSequence = this.f11739mbcevpiqjq;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f11722cdpycssgdh.setVisibility(0);
            } else {
                v2.esjtqupxsv esjtqupxsvVar = this.f11734jpowsppfya;
                if (esjtqupxsvVar != null) {
                    esjtqupxsvVar.draadjrbmk();
                }
                this.f11722cdpycssgdh.setVisibility(8);
            }
        }
    }

    private void iozdgvuglv() {
        ImageView imageView = this.f11742pmvmpeiblj;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            this.f11742pmvmpeiblj.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean istkbnxepw() {
        v2.esjtqupxsv esjtqupxsvVar = this.f11734jpowsppfya;
        return esjtqupxsvVar != null && this.f11728hcddaimhww != null && esjtqupxsvVar.kcexrzcfyt(30) && esjtqupxsvVar.ojitshcjhn().ppxfxbqfkf(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jhduphickx() {
        if (hcddaimhww() && this.f11743sopmlzcsov) {
            lmojexxdyd();
        } else {
            cllcsxoeiz(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jlmebxxoox() {
        v2.esjtqupxsv esjtqupxsvVar = this.f11734jpowsppfya;
        jpowsppfya jpowsppfyaVarJpowsppfya = esjtqupxsvVar != null ? esjtqupxsvVar.jpowsppfya() : jpowsppfya.f115374eablkybsjg;
        int i13 = jpowsppfyaVarJpowsppfya.f115378iobyxmoadg;
        int i14 = jpowsppfyaVarJpowsppfya.f115381zoijcleaow;
        dsvhmnatus(this.f11750yggfygwlhe, this.f11724cqumvgiudr ? 0.0f : (i14 == 0 || i13 == 0) ? 0.0f : (i13 * jpowsppfyaVarJpowsppfya.f115380wkgbmnqykc) / i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object jpowsppfya(Object obj, Method method, Object[] objArr) {
        if (!method.getName().equals("onImageAvailable")) {
            return null;
        }
        wypolnanlu((Bitmap) objArr[1]);
        return null;
    }

    private void jztzpxfvev() {
        Drawable drawable;
        ImageView imageView = this.f11737lereixgezr;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.f11748wypolnanlu == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (this.f11737lereixgezr.getVisibility() == 0) {
            dsvhmnatus(this.f11750yggfygwlhe, width);
        }
        this.f11737lereixgezr.setScaleType(scaleType);
    }

    private boolean kegysxyocb(Drawable drawable) {
        if (this.f11742pmvmpeiblj != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f11726dsvhmnatus == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                dsvhmnatus(this.f11750yggfygwlhe, width);
                this.f11742pmvmpeiblj.setScaleType(scaleType);
                this.f11742pmvmpeiblj.setImageDrawable(drawable);
                this.f11742pmvmpeiblj.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private static void lereixgezr(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(stevsuqkhv.sopmlzcsov(context, resources, d5.jyumaefscl.exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(d5.zdlpuopuiu.exo_edit_mode_background_color));
    }

    private boolean mbcevpiqjq() {
        v2.esjtqupxsv esjtqupxsvVar = this.f11734jpowsppfya;
        if (esjtqupxsvVar == null) {
            return true;
        }
        int iTzroggbefp = esjtqupxsvVar.tzroggbefp();
        return this.f11746ulzqkzuiru && !(this.f11734jpowsppfya.kcexrzcfyt(17) && this.f11734jpowsppfya.jyumaefscl().vdvldrhtss()) && (iTzroggbefp == 1 || iTzroggbefp == 4 || !((v2.esjtqupxsv) y2.iobyxmoadg.eablkybsjg(this.f11734jpowsppfya)).iozdgvuglv());
    }

    private boolean metgxyhuhe() {
        if (!this.f11729hkdspvbjdz) {
            return false;
        }
        y2.iobyxmoadg.dxjokdxxww(this.f11749yadqdtsiqt);
        return true;
    }

    static /* synthetic */ wkgbmnqykc ojitshcjhn(PlayerView playerView) {
        playerView.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void okpsazkaxt(boolean z13) {
        v2.esjtqupxsv esjtqupxsvVar = this.f11734jpowsppfya;
        boolean z14 = false;
        boolean z15 = (esjtqupxsvVar == null || !esjtqupxsvVar.kcexrzcfyt(30) || esjtqupxsvVar.ojitshcjhn().zoijcleaow()) ? false : true;
        if (!this.f11745tzroggbefp && (!z15 || z13)) {
            iozdgvuglv();
            esjtqupxsv();
            yadqdtsiqt();
        }
        if (z15) {
            boolean zCdpycssgdh = cdpycssgdh();
            boolean zIstkbnxepw = istkbnxepw();
            if (!zCdpycssgdh && !zIstkbnxepw) {
                esjtqupxsv();
                yadqdtsiqt();
            }
            View view = this.f11735jyumaefscl;
            if (view != null && view.getVisibility() == 4 && pkzmftpjix()) {
                z14 = true;
            }
            if (zIstkbnxepw && !zCdpycssgdh && z14) {
                esjtqupxsv();
                sopmlzcsov();
            } else if (zCdpycssgdh && !zIstkbnxepw && z14) {
                yadqdtsiqt();
            }
            if (zCdpycssgdh || zIstkbnxepw || !xrmfcynszj() || !(stevsuqkhv(esjtqupxsvVar) || kegysxyocb(this.f11744stevsuqkhv))) {
                iozdgvuglv();
            }
        }
    }

    private boolean pkzmftpjix() {
        Drawable drawable;
        ImageView imageView = this.f11737lereixgezr;
        return (imageView == null || (drawable = imageView.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
    }

    private static void pmvmpeiblj(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(stevsuqkhv.sopmlzcsov(context, resources, d5.jyumaefscl.exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(d5.zdlpuopuiu.exo_edit_mode_background_color, null));
    }

    static /* synthetic */ eablkybsjg rgvfuqvkyq(PlayerView playerView) {
        playerView.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    public void ribwqtqdhb() {
        boolean z13;
        if (this.f11731istkbnxepw != null) {
            v2.esjtqupxsv esjtqupxsvVar = this.f11734jpowsppfya;
            if (esjtqupxsvVar == null || esjtqupxsvVar.tzroggbefp() != 2) {
                z13 = false;
            } else {
                int i13 = this.f11736kegysxyocb;
                z13 = true;
                if (i13 != 2 && (i13 != 1 || !this.f11734jpowsppfya.iozdgvuglv())) {
                    z13 = false;
                }
            }
            this.f11731istkbnxepw.setVisibility(z13 ? 0 : 8);
        }
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.f11737lereixgezr;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        jztzpxfvev();
    }

    private void setImageOutput(v2.esjtqupxsv esjtqupxsvVar) {
        Class cls = this.f11751ylkuphrtab;
        if (cls == null || !cls.isAssignableFrom(esjtqupxsvVar.getClass())) {
            return;
        }
        try {
            ((Method) y2.iobyxmoadg.eablkybsjg(this.f11741pkzmftpjix)).invoke(esjtqupxsvVar, y2.iobyxmoadg.eablkybsjg(this.f11728hcddaimhww));
        } catch (IllegalAccessException | InvocationTargetException e13) {
            throw new RuntimeException(e13);
        }
    }

    private void sopmlzcsov() {
        ImageView imageView = this.f11737lereixgezr;
        if (imageView != null) {
            imageView.setVisibility(0);
            jztzpxfvev();
        }
    }

    private boolean stevsuqkhv(v2.esjtqupxsv esjtqupxsvVar) {
        byte[] bArr;
        if (esjtqupxsvVar == null || !esjtqupxsvVar.kcexrzcfyt(18) || (bArr = esjtqupxsvVar.jhduphickx().f115750dxjokdxxww) == null) {
            return false;
        }
        return kegysxyocb(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    private static void tzroggbefp(AspectRatioFrameLayout aspectRatioFrameLayout, int i13) {
        aspectRatioFrameLayout.setResizeMode(i13);
    }

    private void ulzqkzuiru(boolean z13) {
        if (metgxyhuhe()) {
            this.f11749yadqdtsiqt.setShowTimeoutMs(z13 ? 0 : this.f11740ntlheqmsrt);
            this.f11749yadqdtsiqt.sflfametgt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vipkmwdibw() {
        androidx.media3.ui.wkgbmnqykc wkgbmnqykcVar = this.f11749yadqdtsiqt;
        if (wkgbmnqykcVar == null || !this.f11729hkdspvbjdz) {
            setContentDescription(null);
        } else if (wkgbmnqykcVar.ikoacuggdj()) {
            setContentDescription(this.f11725crxdokpmqz ? getResources().getString(d5.zynmafqrjb.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(d5.zynmafqrjb.exo_controls_show));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wwaezpbzkn() {
        ImageView imageView = this.f11737lereixgezr;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    private void wypolnanlu(final Bitmap bitmap) {
        this.f11747wwaezpbzkn.post(new Runnable() { // from class: d5.btonecajqb
            @Override // java.lang.Runnable
            public final void run() {
                this.f27050zdlpuopuiu.hkdspvbjdz(bitmap);
            }
        });
    }

    private boolean xrmfcynszj() {
        if (this.f11726dsvhmnatus == 0) {
            return false;
        }
        y2.iobyxmoadg.dxjokdxxww(this.f11742pmvmpeiblj);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yadqdtsiqt() {
        wwaezpbzkn();
        ImageView imageView = this.f11737lereixgezr;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
        }
    }

    private boolean ylkuphrtab(int i13) {
        return i13 == 19 || i13 == 270 || i13 == 22 || i13 == 271 || i13 == 20 || i13 == 269 || i13 == 21 || i13 == 268 || i13 == 23;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        gxszxtbevo gxszxtbevoVar;
        super.dispatchDraw(canvas);
        if (stevsuqkhv.f123602iobyxmoadg == 34 && (gxszxtbevoVar = this.f11727esjtqupxsv) != null && this.f11733jlmebxxoox) {
            gxszxtbevoVar.eablkybsjg();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        v2.esjtqupxsv esjtqupxsvVar = this.f11734jpowsppfya;
        if (esjtqupxsvVar != null && esjtqupxsvVar.kcexrzcfyt(16) && this.f11734jpowsppfya.ppxfxbqfkf()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zYlkuphrtab = ylkuphrtab(keyEvent.getKeyCode());
        if (zYlkuphrtab && metgxyhuhe() && !this.f11749yadqdtsiqt.ikoacuggdj()) {
            cllcsxoeiz(true);
            return true;
        }
        if (zynmafqrjb(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            cllcsxoeiz(true);
            return true;
        }
        if (zYlkuphrtab && metgxyhuhe()) {
            cllcsxoeiz(true);
        }
        return false;
    }

    protected void dsvhmnatus(AspectRatioFrameLayout aspectRatioFrameLayout, float f13) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f13);
        }
    }

    public List<v2.iobyxmoadg> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f11738lmojexxdyd;
        if (frameLayout != null) {
            arrayList.add(new v2.iobyxmoadg.C2872iobyxmoadg(frameLayout, 4).zoijcleaow("Transparent overlay does not impact viewability").iobyxmoadg());
        }
        androidx.media3.ui.wkgbmnqykc wkgbmnqykcVar = this.f11749yadqdtsiqt;
        if (wkgbmnqykcVar != null) {
            arrayList.add(new v2.iobyxmoadg.C2872iobyxmoadg(wkgbmnqykcVar, 1).iobyxmoadg());
        }
        return com.google.common.collect.zdlpuopuiu.jyumaefscl(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) y2.iobyxmoadg.btonecajqb(this.f11730iozdgvuglv, "exo_ad_overlay must be present for ad playback");
    }

    public int getArtworkDisplayMode() {
        return this.f11726dsvhmnatus;
    }

    public boolean getControllerAutoShow() {
        return this.f11746ulzqkzuiru;
    }

    public boolean getControllerHideOnTouch() {
        return this.f11725crxdokpmqz;
    }

    public int getControllerShowTimeoutMs() {
        return this.f11740ntlheqmsrt;
    }

    public Drawable getDefaultArtwork() {
        return this.f11744stevsuqkhv;
    }

    public int getImageDisplayMode() {
        return this.f11748wypolnanlu;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f11738lmojexxdyd;
    }

    public v2.esjtqupxsv getPlayer() {
        return this.f11734jpowsppfya;
    }

    public int getResizeMode() {
        y2.iobyxmoadg.dxjokdxxww(this.f11750yggfygwlhe);
        return this.f11750yggfygwlhe.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f11753zynmafqrjb;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.f11726dsvhmnatus != 0;
    }

    public boolean getUseController() {
        return this.f11729hkdspvbjdz;
    }

    public View getVideoSurfaceView() {
        return this.f11732iwizpuwonk;
    }

    public void lmojexxdyd() {
        androidx.media3.ui.wkgbmnqykc wkgbmnqykcVar = this.f11749yadqdtsiqt;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.jlmebxxoox();
        }
    }

    public void ntlheqmsrt() {
        ulzqkzuiru(mbcevpiqjq());
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!metgxyhuhe() || this.f11734jpowsppfya == null) {
            return false;
        }
        cllcsxoeiz(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        crxdokpmqz();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i13) {
        y2.iobyxmoadg.lqeggnwhkg(i13 == 0 || this.f11742pmvmpeiblj != null);
        if (this.f11726dsvhmnatus != i13) {
            this.f11726dsvhmnatus = i13;
            okpsazkaxt(false);
        }
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.zoijcleaow zoijcleaowVar) {
        y2.iobyxmoadg.dxjokdxxww(this.f11750yggfygwlhe);
        this.f11750yggfygwlhe.setAspectRatioListener(zoijcleaowVar);
    }

    public void setControllerAnimationEnabled(boolean z13) {
        y2.iobyxmoadg.dxjokdxxww(this.f11749yadqdtsiqt);
        this.f11749yadqdtsiqt.setAnimationEnabled(z13);
    }

    public void setControllerAutoShow(boolean z13) {
        this.f11746ulzqkzuiru = z13;
    }

    public void setControllerHideDuringAds(boolean z13) {
        this.f11743sopmlzcsov = z13;
    }

    public void setControllerHideOnTouch(boolean z13) {
        y2.iobyxmoadg.dxjokdxxww(this.f11749yadqdtsiqt);
        this.f11725crxdokpmqz = z13;
        vipkmwdibw();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(androidx.media3.ui.wkgbmnqykc.InterfaceC0170wkgbmnqykc interfaceC0170wkgbmnqykc) {
        y2.iobyxmoadg.dxjokdxxww(this.f11749yadqdtsiqt);
        this.f11749yadqdtsiqt.setOnFullScreenModeChangedListener(interfaceC0170wkgbmnqykc);
    }

    public void setControllerShowTimeoutMs(int i13) {
        y2.iobyxmoadg.dxjokdxxww(this.f11749yadqdtsiqt);
        this.f11740ntlheqmsrt = i13;
        if (this.f11749yadqdtsiqt.ikoacuggdj()) {
            ntlheqmsrt();
        }
    }

    public void setControllerVisibilityListener(wkgbmnqykc wkgbmnqykcVar) {
        if (wkgbmnqykcVar != null) {
            setControllerVisibilityListener((androidx.media3.ui.wkgbmnqykc.wflxmlrfwp) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        y2.iobyxmoadg.lqeggnwhkg(this.f11722cdpycssgdh != null);
        this.f11739mbcevpiqjq = charSequence;
        ikoacuggdj();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f11744stevsuqkhv != drawable) {
            this.f11744stevsuqkhv = drawable;
            okpsazkaxt(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z13) {
        this.f11733jlmebxxoox = z13;
    }

    public void setErrorMessageProvider(v2.agtfadlqog agtfadlqogVar) {
        if (agtfadlqogVar != null) {
            ikoacuggdj();
        }
    }

    public void setFullscreenButtonClickListener(eablkybsjg eablkybsjgVar) {
        y2.iobyxmoadg.dxjokdxxww(this.f11749yadqdtsiqt);
        this.f11749yadqdtsiqt.setOnFullScreenModeChangedListener(this.f11752zdlpuopuiu);
    }

    public void setFullscreenButtonState(boolean z13) {
        y2.iobyxmoadg.dxjokdxxww(this.f11749yadqdtsiqt);
        this.f11749yadqdtsiqt.weqkydbzbr(z13);
    }

    public void setImageDisplayMode(int i13) {
        y2.iobyxmoadg.lqeggnwhkg(this.f11737lereixgezr != null);
        if (this.f11748wypolnanlu != i13) {
            this.f11748wypolnanlu = i13;
            jztzpxfvev();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z13) {
        if (this.f11745tzroggbefp != z13) {
            this.f11745tzroggbefp = z13;
            okpsazkaxt(false);
        }
    }

    public void setPlayer(v2.esjtqupxsv esjtqupxsvVar) {
        y2.iobyxmoadg.lqeggnwhkg(Looper.myLooper() == Looper.getMainLooper());
        y2.iobyxmoadg.iobyxmoadg(esjtqupxsvVar == null || esjtqupxsvVar.iwizpuwonk() == Looper.getMainLooper());
        v2.esjtqupxsv esjtqupxsvVar2 = this.f11734jpowsppfya;
        if (esjtqupxsvVar2 == esjtqupxsvVar) {
            return;
        }
        if (esjtqupxsvVar2 != null) {
            esjtqupxsvVar2.pmvmpeiblj(this.f11752zdlpuopuiu);
            if (esjtqupxsvVar2.kcexrzcfyt(27)) {
                View view = this.f11732iwizpuwonk;
                if (view instanceof TextureView) {
                    esjtqupxsvVar2.hcddaimhww((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    esjtqupxsvVar2.ulzqkzuiru((SurfaceView) view);
                }
            }
            cqumvgiudr(esjtqupxsvVar2);
        }
        SubtitleView subtitleView = this.f11753zynmafqrjb;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f11734jpowsppfya = esjtqupxsvVar;
        if (metgxyhuhe()) {
            this.f11749yadqdtsiqt.setPlayer(esjtqupxsvVar);
        }
        ribwqtqdhb();
        ikoacuggdj();
        okpsazkaxt(true);
        if (esjtqupxsvVar == null) {
            lmojexxdyd();
            return;
        }
        if (esjtqupxsvVar.kcexrzcfyt(27)) {
            View view2 = this.f11732iwizpuwonk;
            if (view2 instanceof TextureView) {
                esjtqupxsvVar.lereixgezr((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                esjtqupxsvVar.btonecajqb((SurfaceView) view2);
            }
            if (!esjtqupxsvVar.kcexrzcfyt(30) || esjtqupxsvVar.ojitshcjhn().wkgbmnqykc(2)) {
                jlmebxxoox();
            }
        }
        if (this.f11753zynmafqrjb != null && esjtqupxsvVar.kcexrzcfyt(28)) {
            this.f11753zynmafqrjb.setCues(esjtqupxsvVar.vdvldrhtss().f121003iobyxmoadg);
        }
        esjtqupxsvVar.zynmafqrjb(this.f11752zdlpuopuiu);
        setImageOutput(esjtqupxsvVar);
        cllcsxoeiz(false);
    }

    public void setRepeatToggleModes(int i13) {
        y2.iobyxmoadg.dxjokdxxww(this.f11749yadqdtsiqt);
        this.f11749yadqdtsiqt.setRepeatToggleModes(i13);
    }

    public void setResizeMode(int i13) {
        y2.iobyxmoadg.dxjokdxxww(this.f11750yggfygwlhe);
        this.f11750yggfygwlhe.setResizeMode(i13);
    }

    public void setShowBuffering(int i13) {
        if (this.f11736kegysxyocb != i13) {
            this.f11736kegysxyocb = i13;
            ribwqtqdhb();
        }
    }

    public void setShowFastForwardButton(boolean z13) {
        y2.iobyxmoadg.dxjokdxxww(this.f11749yadqdtsiqt);
        this.f11749yadqdtsiqt.setShowFastForwardButton(z13);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z13) {
        y2.iobyxmoadg.dxjokdxxww(this.f11749yadqdtsiqt);
        this.f11749yadqdtsiqt.setShowMultiWindowTimeBar(z13);
    }

    public void setShowNextButton(boolean z13) {
        y2.iobyxmoadg.dxjokdxxww(this.f11749yadqdtsiqt);
        this.f11749yadqdtsiqt.setShowNextButton(z13);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z13) {
        y2.iobyxmoadg.dxjokdxxww(this.f11749yadqdtsiqt);
        this.f11749yadqdtsiqt.setShowPlayButtonIfPlaybackIsSuppressed(z13);
    }

    public void setShowPreviousButton(boolean z13) {
        y2.iobyxmoadg.dxjokdxxww(this.f11749yadqdtsiqt);
        this.f11749yadqdtsiqt.setShowPreviousButton(z13);
    }

    public void setShowRewindButton(boolean z13) {
        y2.iobyxmoadg.dxjokdxxww(this.f11749yadqdtsiqt);
        this.f11749yadqdtsiqt.setShowRewindButton(z13);
    }

    public void setShowShuffleButton(boolean z13) {
        y2.iobyxmoadg.dxjokdxxww(this.f11749yadqdtsiqt);
        this.f11749yadqdtsiqt.setShowShuffleButton(z13);
    }

    public void setShowSubtitleButton(boolean z13) {
        y2.iobyxmoadg.dxjokdxxww(this.f11749yadqdtsiqt);
        this.f11749yadqdtsiqt.setShowSubtitleButton(z13);
    }

    public void setShowVrButton(boolean z13) {
        y2.iobyxmoadg.dxjokdxxww(this.f11749yadqdtsiqt);
        this.f11749yadqdtsiqt.setShowVrButton(z13);
    }

    public void setShutterBackgroundColor(int i13) {
        View view = this.f11735jyumaefscl;
        if (view != null) {
            view.setBackgroundColor(i13);
        }
    }

    @Deprecated
    public void setUseArtwork(boolean z13) {
        setArtworkDisplayMode(!z13 ? 1 : 0);
    }

    public void setUseController(boolean z13) {
        boolean z14 = true;
        y2.iobyxmoadg.lqeggnwhkg((z13 && this.f11749yadqdtsiqt == null) ? false : true);
        if (!z13 && !hasOnClickListeners()) {
            z14 = false;
        }
        setClickable(z14);
        if (this.f11729hkdspvbjdz == z13) {
            return;
        }
        this.f11729hkdspvbjdz = z13;
        if (metgxyhuhe()) {
            this.f11749yadqdtsiqt.setPlayer(this.f11734jpowsppfya);
        } else {
            androidx.media3.ui.wkgbmnqykc wkgbmnqykcVar = this.f11749yadqdtsiqt;
            if (wkgbmnqykcVar != null) {
                wkgbmnqykcVar.jlmebxxoox();
                this.f11749yadqdtsiqt.setPlayer(null);
            }
        }
        vipkmwdibw();
    }

    @Override // android.view.View
    public void setVisibility(int i13) {
        super.setVisibility(i13);
        View view = this.f11732iwizpuwonk;
        if (view instanceof SurfaceView) {
            view.setVisibility(i13);
        }
    }

    public boolean zynmafqrjb(KeyEvent keyEvent) {
        return metgxyhuhe() && this.f11749yadqdtsiqt.ntlheqmsrt(keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, AttributeSet attributeSet, int i13) {
        int i14;
        int i15;
        boolean z13;
        boolean z14;
        int i16;
        int i17;
        int i18;
        int i19;
        int i23;
        boolean z15;
        int i24;
        boolean z16;
        int i25;
        boolean z17;
        boolean z18;
        iobyxmoadg iobyxmoadgVar;
        boolean z19;
        Class<ExoPlayer> cls;
        Object objNewProxyInstance;
        Method method;
        int i26;
        super(context, attributeSet, i13);
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf();
        this.f11752zdlpuopuiu = ppxfxbqfkfVar;
        this.f11747wwaezpbzkn = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.f11750yggfygwlhe = null;
            this.f11735jyumaefscl = null;
            this.f11732iwizpuwonk = null;
            this.f11724cqumvgiudr = false;
            this.f11727esjtqupxsv = null;
            this.f11737lereixgezr = null;
            this.f11742pmvmpeiblj = null;
            this.f11753zynmafqrjb = null;
            this.f11731istkbnxepw = null;
            this.f11722cdpycssgdh = null;
            this.f11749yadqdtsiqt = null;
            this.f11730iozdgvuglv = null;
            this.f11738lmojexxdyd = null;
            this.f11751ylkuphrtab = null;
            this.f11741pkzmftpjix = null;
            this.f11728hcddaimhww = null;
            ImageView imageView = new ImageView(context);
            if (stevsuqkhv.f123602iobyxmoadg >= 23) {
                pmvmpeiblj(context, getResources(), imageView);
            } else {
                lereixgezr(context, getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i27 = d5.lereixgezr.exo_player_view;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, d5.cdpycssgdh.PlayerView, i13, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(d5.cdpycssgdh.PlayerView_shutter_background_color);
                int color = typedArrayObtainStyledAttributes.getColor(d5.cdpycssgdh.PlayerView_shutter_background_color, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(d5.cdpycssgdh.PlayerView_player_layout_id, i27);
                boolean z23 = typedArrayObtainStyledAttributes.getBoolean(d5.cdpycssgdh.PlayerView_use_artwork, true);
                int i28 = typedArrayObtainStyledAttributes.getInt(d5.cdpycssgdh.PlayerView_artwork_display_mode, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(d5.cdpycssgdh.PlayerView_default_artwork, 0);
                int i29 = typedArrayObtainStyledAttributes.getInt(d5.cdpycssgdh.PlayerView_image_display_mode, 0);
                boolean z24 = typedArrayObtainStyledAttributes.getBoolean(d5.cdpycssgdh.PlayerView_use_controller, true);
                int i33 = typedArrayObtainStyledAttributes.getInt(d5.cdpycssgdh.PlayerView_surface_type, 1);
                int i34 = typedArrayObtainStyledAttributes.getInt(d5.cdpycssgdh.PlayerView_resize_mode, 0);
                i14 = typedArrayObtainStyledAttributes.getInt(d5.cdpycssgdh.PlayerView_show_timeout, 5000);
                boolean z25 = typedArrayObtainStyledAttributes.getBoolean(d5.cdpycssgdh.PlayerView_hide_on_touch, true);
                z18 = typedArrayObtainStyledAttributes.getBoolean(d5.cdpycssgdh.PlayerView_auto_show, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(d5.cdpycssgdh.PlayerView_show_buffering, 0);
                this.f11745tzroggbefp = typedArrayObtainStyledAttributes.getBoolean(d5.cdpycssgdh.PlayerView_keep_content_on_player_reset, this.f11745tzroggbefp);
                boolean z26 = typedArrayObtainStyledAttributes.getBoolean(d5.cdpycssgdh.PlayerView_hide_during_ads, true);
                typedArrayObtainStyledAttributes.recycle();
                i18 = resourceId2;
                z14 = z25;
                z17 = z26;
                z16 = z23;
                i15 = resourceId;
                z13 = z24;
                z15 = zHasValue;
                i19 = i34;
                i16 = i29;
                i25 = i28;
                i24 = color;
                i23 = i33;
                i17 = integer;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i14 = 5000;
            i15 = i27;
            z13 = true;
            z14 = true;
            i16 = 0;
            i17 = 0;
            i18 = 0;
            i19 = 0;
            i23 = 1;
            z15 = false;
            i24 = 0;
            z16 = true;
            i25 = 1;
            z17 = true;
            z18 = true;
        }
        LayoutInflater.from(context).inflate(i15, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(d5.cqumvgiudr.exo_content_frame);
        this.f11750yggfygwlhe = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            tzroggbefp(aspectRatioFrameLayout, i19);
        }
        View viewFindViewById = findViewById(d5.cqumvgiudr.exo_shutter);
        this.f11735jyumaefscl = viewFindViewById;
        if (viewFindViewById != null && z15) {
            viewFindViewById.setBackgroundColor(i24);
        }
        if (aspectRatioFrameLayout == null || i23 == 0) {
            iobyxmoadgVar = null;
            this.f11732iwizpuwonk = null;
            z19 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i23 != 2) {
                if (i23 == 3) {
                    try {
                        int i35 = s3.draadjrbmk.f105265iozdgvuglv;
                        this.f11732iwizpuwonk = (View) s3.draadjrbmk.class.getConstructor(Context.class).newInstance(context);
                        z19 = true;
                    } catch (Exception e13) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e13);
                    }
                } else if (i23 != 4) {
                    SurfaceView surfaceView = new SurfaceView(context);
                    if (stevsuqkhv.f123602iobyxmoadg >= 34) {
                        zoijcleaow.iobyxmoadg(surfaceView);
                    }
                    this.f11732iwizpuwonk = surfaceView;
                } else {
                    try {
                        int i36 = r3.eablkybsjg.f81523yggfygwlhe;
                        this.f11732iwizpuwonk = (View) r3.eablkybsjg.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e14) {
                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e14);
                    }
                }
                this.f11732iwizpuwonk.setLayoutParams(layoutParams);
                this.f11732iwizpuwonk.setOnClickListener(ppxfxbqfkfVar);
                this.f11732iwizpuwonk.setClickable(false);
                aspectRatioFrameLayout.addView(this.f11732iwizpuwonk, 0);
                iobyxmoadgVar = null;
            } else {
                this.f11732iwizpuwonk = new TextureView(context);
            }
            z19 = false;
            this.f11732iwizpuwonk.setLayoutParams(layoutParams);
            this.f11732iwizpuwonk.setOnClickListener(ppxfxbqfkfVar);
            this.f11732iwizpuwonk.setClickable(false);
            aspectRatioFrameLayout.addView(this.f11732iwizpuwonk, 0);
            iobyxmoadgVar = null;
        }
        this.f11724cqumvgiudr = z19;
        this.f11727esjtqupxsv = stevsuqkhv.f123602iobyxmoadg == 34 ? new gxszxtbevo() : null;
        this.f11730iozdgvuglv = (FrameLayout) findViewById(d5.cqumvgiudr.exo_ad_overlay);
        this.f11738lmojexxdyd = (FrameLayout) findViewById(d5.cqumvgiudr.exo_overlay);
        this.f11737lereixgezr = (ImageView) findViewById(d5.cqumvgiudr.exo_image);
        this.f11748wypolnanlu = i16;
        try {
            cls = ExoPlayer.class;
            ImageOutput imageOutput = ImageOutput.f10578iobyxmoadg;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            objNewProxyInstance = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: d5.dxjokdxxww
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    return this.f27052iobyxmoadg.jpowsppfya(obj, method2, objArr);
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.f11751ylkuphrtab = cls;
        this.f11741pkzmftpjix = method;
        this.f11728hcddaimhww = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(d5.cqumvgiudr.exo_artwork);
        this.f11742pmvmpeiblj = imageView2;
        this.f11726dsvhmnatus = (!z16 || i25 == 0 || imageView2 == null) ? 0 : i25;
        if (i18 != 0) {
            this.f11744stevsuqkhv = androidx.core.content.iobyxmoadg.getDrawable(getContext(), i18);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(d5.cqumvgiudr.exo_subtitles);
        this.f11753zynmafqrjb = subtitleView;
        if (subtitleView != null) {
            subtitleView.wkgbmnqykc();
            subtitleView.eablkybsjg();
        }
        View viewFindViewById2 = findViewById(d5.cqumvgiudr.exo_buffering);
        this.f11731istkbnxepw = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f11736kegysxyocb = i17;
        TextView textView = (TextView) findViewById(d5.cqumvgiudr.exo_error_message);
        this.f11722cdpycssgdh = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        androidx.media3.ui.wkgbmnqykc wkgbmnqykcVar = (androidx.media3.ui.wkgbmnqykc) findViewById(d5.cqumvgiudr.exo_controller);
        View viewFindViewById3 = findViewById(d5.cqumvgiudr.exo_controller_placeholder);
        if (wkgbmnqykcVar != null) {
            this.f11749yadqdtsiqt = wkgbmnqykcVar;
            i26 = 0;
        } else if (viewFindViewById3 != null) {
            i26 = 0;
            androidx.media3.ui.wkgbmnqykc wkgbmnqykcVar2 = new androidx.media3.ui.wkgbmnqykc(context, null, 0, attributeSet);
            this.f11749yadqdtsiqt = wkgbmnqykcVar2;
            wkgbmnqykcVar2.setId(d5.cqumvgiudr.exo_controller);
            wkgbmnqykcVar2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(wkgbmnqykcVar2, iIndexOfChild);
        } else {
            i26 = 0;
            this.f11749yadqdtsiqt = null;
        }
        androidx.media3.ui.wkgbmnqykc wkgbmnqykcVar3 = this.f11749yadqdtsiqt;
        this.f11740ntlheqmsrt = wkgbmnqykcVar3 != null ? i14 : i26;
        this.f11725crxdokpmqz = z14;
        this.f11746ulzqkzuiru = z18;
        this.f11743sopmlzcsov = z17;
        this.f11729hkdspvbjdz = (!z13 || wkgbmnqykcVar3 == null) ? i26 : 1;
        if (wkgbmnqykcVar3 != null) {
            wkgbmnqykcVar3.ribwqtqdhb();
            this.f11749yadqdtsiqt.tzroggbefp(this.f11752zdlpuopuiu);
        }
        if (z13) {
            setClickable(true);
        }
        vipkmwdibw();
    }

    @Deprecated
    public void setControllerVisibilityListener(androidx.media3.ui.wkgbmnqykc.wflxmlrfwp wflxmlrfwpVar) {
        y2.iobyxmoadg.dxjokdxxww(this.f11749yadqdtsiqt);
        androidx.media3.ui.wkgbmnqykc.wflxmlrfwp wflxmlrfwpVar2 = this.f11723cllcsxoeiz;
        if (wflxmlrfwpVar2 == wflxmlrfwpVar) {
            return;
        }
        if (wflxmlrfwpVar2 != null) {
            this.f11749yadqdtsiqt.uwvvkdfqfp(wflxmlrfwpVar2);
        }
        this.f11723cllcsxoeiz = wflxmlrfwpVar;
        if (wflxmlrfwpVar != null) {
            this.f11749yadqdtsiqt.tzroggbefp(wflxmlrfwpVar);
            setControllerVisibilityListener((wkgbmnqykc) null);
        }
    }
}
