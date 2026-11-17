package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public class zoijcleaow extends View implements lmojexxdyd {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final Drawable f12010cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private final StringBuilder f12011cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final Paint f12012cqumvgiudr;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private ValueAnimator f12013crxdokpmqz;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private final Formatter f12014dsvhmnatus;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final Paint f12015esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final int f12016hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private final int f12017hkdspvbjdz;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    private long f12018ikoacuggdj;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final int f12019iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final Paint f12020istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Rect f12021iwizpuwonk;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    private long f12022jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private float f12023jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final int f12024jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Rect f12025jyumaefscl;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    private long f12026jztzpxfvev;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private final Point f12027kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final Paint f12028lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final int f12029lmojexxdyd;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private int f12030mbcevpiqjq;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    private long[] f12031metgxyhuhe;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private long f12032ntlheqmsrt;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    private long f12033okpsazkaxt;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private final int f12034pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final Paint f12035pmvmpeiblj;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private boolean f12036ribwqtqdhb;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    private boolean[] f12037rlfsiqarku;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private Rect f12038sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private final CopyOnWriteArraySet f12039stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private final float f12040tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private int f12041ulzqkzuiru;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private boolean f12042vipkmwdibw;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private final int f12043wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private final Runnable f12044wypolnanlu;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    private int f12045xrmfcynszj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final int f12046yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Rect f12047yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private final int f12048ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Rect f12049zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final Paint f12050zynmafqrjb;

    public zoijcleaow(Context context, AttributeSet attributeSet, int i13, AttributeSet attributeSet2, int i14) {
        super(context, attributeSet, i13);
        this.f12049zdlpuopuiu = new Rect();
        this.f12047yggfygwlhe = new Rect();
        this.f12025jyumaefscl = new Rect();
        this.f12021iwizpuwonk = new Rect();
        Paint paint = new Paint();
        this.f12012cqumvgiudr = paint;
        Paint paint2 = new Paint();
        this.f12015esjtqupxsv = paint2;
        Paint paint3 = new Paint();
        this.f12028lereixgezr = paint3;
        Paint paint4 = new Paint();
        this.f12035pmvmpeiblj = paint4;
        Paint paint5 = new Paint();
        this.f12050zynmafqrjb = paint5;
        Paint paint6 = new Paint();
        this.f12020istkbnxepw = paint6;
        paint6.setAntiAlias(true);
        this.f12039stevsuqkhv = new CopyOnWriteArraySet();
        this.f12027kegysxyocb = new Point();
        float f13 = context.getResources().getDisplayMetrics().density;
        this.f12040tzroggbefp = f13;
        this.f12017hkdspvbjdz = eablkybsjg(f13, -50);
        int iEablkybsjg = eablkybsjg(f13, 4);
        int iEablkybsjg2 = eablkybsjg(f13, 26);
        int iEablkybsjg3 = eablkybsjg(f13, 4);
        int iEablkybsjg4 = eablkybsjg(f13, 12);
        int iEablkybsjg5 = eablkybsjg(f13, 0);
        int iEablkybsjg6 = eablkybsjg(f13, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, d5.cdpycssgdh.DefaultTimeBar, i13, i14);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(d5.cdpycssgdh.DefaultTimeBar_scrubber_drawable);
                this.f12010cdpycssgdh = drawable;
                if (drawable != null) {
                    vdvldrhtss(drawable);
                    iEablkybsjg2 = Math.max(drawable.getMinimumHeight(), iEablkybsjg2);
                }
                this.f12046yadqdtsiqt = typedArrayObtainStyledAttributes.getDimensionPixelSize(d5.cdpycssgdh.DefaultTimeBar_bar_height, iEablkybsjg);
                this.f12019iozdgvuglv = typedArrayObtainStyledAttributes.getDimensionPixelSize(d5.cdpycssgdh.DefaultTimeBar_touch_target_height, iEablkybsjg2);
                this.f12029lmojexxdyd = typedArrayObtainStyledAttributes.getInt(d5.cdpycssgdh.DefaultTimeBar_bar_gravity, 0);
                this.f12043wwaezpbzkn = typedArrayObtainStyledAttributes.getDimensionPixelSize(d5.cdpycssgdh.DefaultTimeBar_ad_marker_width, iEablkybsjg3);
                this.f12048ylkuphrtab = typedArrayObtainStyledAttributes.getDimensionPixelSize(d5.cdpycssgdh.DefaultTimeBar_scrubber_enabled_size, iEablkybsjg4);
                this.f12034pkzmftpjix = typedArrayObtainStyledAttributes.getDimensionPixelSize(d5.cdpycssgdh.DefaultTimeBar_scrubber_disabled_size, iEablkybsjg5);
                this.f12016hcddaimhww = typedArrayObtainStyledAttributes.getDimensionPixelSize(d5.cdpycssgdh.DefaultTimeBar_scrubber_dragged_size, iEablkybsjg6);
                int i15 = typedArrayObtainStyledAttributes.getInt(d5.cdpycssgdh.DefaultTimeBar_played_color, -1);
                int i16 = typedArrayObtainStyledAttributes.getInt(d5.cdpycssgdh.DefaultTimeBar_scrubber_color, -1);
                int i17 = typedArrayObtainStyledAttributes.getInt(d5.cdpycssgdh.DefaultTimeBar_buffered_color, -855638017);
                int i18 = typedArrayObtainStyledAttributes.getInt(d5.cdpycssgdh.DefaultTimeBar_unplayed_color, 872415231);
                int i19 = typedArrayObtainStyledAttributes.getInt(d5.cdpycssgdh.DefaultTimeBar_ad_marker_color, -1291845888);
                int i23 = typedArrayObtainStyledAttributes.getInt(d5.cdpycssgdh.DefaultTimeBar_played_ad_marker_color, 872414976);
                paint.setColor(i15);
                paint6.setColor(i16);
                paint2.setColor(i17);
                paint3.setColor(i18);
                paint4.setColor(i19);
                paint5.setColor(i23);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            this.f12046yadqdtsiqt = iEablkybsjg;
            this.f12019iozdgvuglv = iEablkybsjg2;
            this.f12029lmojexxdyd = 0;
            this.f12043wwaezpbzkn = iEablkybsjg3;
            this.f12048ylkuphrtab = iEablkybsjg4;
            this.f12034pkzmftpjix = iEablkybsjg5;
            this.f12016hcddaimhww = iEablkybsjg6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f12010cdpycssgdh = null;
        }
        StringBuilder sb3 = new StringBuilder();
        this.f12011cllcsxoeiz = sb3;
        this.f12014dsvhmnatus = new Formatter(sb3, Locale.getDefault());
        this.f12044wypolnanlu = new Runnable() { // from class: d5.ppxfxbqfkf
            @Override // java.lang.Runnable
            public final void run() {
                this.f27064zdlpuopuiu.gtknphoqwx();
            }
        };
        Drawable drawable2 = this.f12010cdpycssgdh;
        if (drawable2 != null) {
            this.f12024jpowsppfya = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f12024jpowsppfya = (Math.max(this.f12034pkzmftpjix, Math.max(this.f12048ylkuphrtab, this.f12016hcddaimhww)) + 1) / 2;
        }
        this.f12023jlmebxxoox = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f12013crxdokpmqz = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: d5.wkgbmnqykc
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f27065iobyxmoadg.draadjrbmk(valueAnimator2);
            }
        });
        this.f12018ikoacuggdj = -9223372036854775807L;
        this.f12032ntlheqmsrt = -9223372036854775807L;
        this.f12030mbcevpiqjq = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    private static int agtfadlqog(float f13, int i13) {
        return (int) (i13 / f13);
    }

    private boolean btonecajqb(float f13, float f14) {
        return this.f12049zdlpuopuiu.contains((int) f13, (int) f14);
    }

    private void cqumvgiudr() {
        this.f12025jyumaefscl.set(this.f12047yggfygwlhe);
        this.f12021iwizpuwonk.set(this.f12047yggfygwlhe);
        long j13 = this.f12042vipkmwdibw ? this.f12022jhduphickx : this.f12033okpsazkaxt;
        if (this.f12018ikoacuggdj > 0) {
            int iWidth = (int) ((((long) this.f12047yggfygwlhe.width()) * this.f12026jztzpxfvev) / this.f12018ikoacuggdj);
            Rect rect = this.f12025jyumaefscl;
            Rect rect2 = this.f12047yggfygwlhe;
            rect.right = Math.min(rect2.left + iWidth, rect2.right);
            int iWidth2 = (int) ((((long) this.f12047yggfygwlhe.width()) * j13) / this.f12018ikoacuggdj);
            Rect rect3 = this.f12021iwizpuwonk;
            Rect rect4 = this.f12047yggfygwlhe;
            rect3.right = Math.min(rect4.left + iWidth2, rect4.right);
        } else {
            Rect rect5 = this.f12025jyumaefscl;
            int i13 = this.f12047yggfygwlhe.left;
            rect5.right = i13;
            this.f12021iwizpuwonk.right = i13;
        }
        invalidate(this.f12049zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void draadjrbmk(ValueAnimator valueAnimator) {
        this.f12023jlmebxxoox = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.f12049zdlpuopuiu);
    }

    private static int eablkybsjg(float f13, int i13) {
        return (int) ((i13 * f13) + 0.5f);
    }

    private void esjtqupxsv() {
        Drawable drawable = this.f12010cdpycssgdh;
        if (drawable != null && drawable.isStateful() && this.f12010cdpycssgdh.setState(getDrawableState())) {
            invalidate();
        }
    }

    private long getPositionIncrement() {
        long j13 = this.f12032ntlheqmsrt;
        if (j13 != -9223372036854775807L) {
            return j13;
        }
        long j14 = this.f12018ikoacuggdj;
        if (j14 == -9223372036854775807L) {
            return 0L;
        }
        return j14 / ((long) this.f12030mbcevpiqjq);
    }

    private String getProgressText() {
        return stevsuqkhv.yfnezrywwk(this.f12011cllcsxoeiz, this.f12014dsvhmnatus, this.f12033okpsazkaxt);
    }

    private long getScrubberPosition() {
        if (this.f12047yggfygwlhe.width() <= 0 || this.f12018ikoacuggdj == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f12021iwizpuwonk.width()) * this.f12018ikoacuggdj) / ((long) this.f12047yggfygwlhe.width());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void gtknphoqwx() {
        iwizpuwonk(false);
    }

    private void gxszxtbevo(Canvas canvas) {
        int i13;
        if (this.f12018ikoacuggdj <= 0) {
            return;
        }
        Rect rect = this.f12021iwizpuwonk;
        int iOjitshcjhn = stevsuqkhv.ojitshcjhn(rect.right, rect.left, this.f12047yggfygwlhe.right);
        int iCenterY = this.f12021iwizpuwonk.centerY();
        Drawable drawable = this.f12010cdpycssgdh;
        if (drawable == null) {
            if (this.f12042vipkmwdibw || isFocused()) {
                i13 = this.f12016hcddaimhww;
            } else {
                i13 = isEnabled() ? this.f12048ylkuphrtab : this.f12034pkzmftpjix;
            }
            canvas.drawCircle(iOjitshcjhn, iCenterY, (int) ((i13 * this.f12023jlmebxxoox) / 2.0f), this.f12020istkbnxepw);
            return;
        }
        int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f12023jlmebxxoox)) / 2;
        int intrinsicHeight = ((int) (this.f12010cdpycssgdh.getIntrinsicHeight() * this.f12023jlmebxxoox)) / 2;
        this.f12010cdpycssgdh.setBounds(iOjitshcjhn - intrinsicWidth, iCenterY - intrinsicHeight, iOjitshcjhn + intrinsicWidth, iCenterY + intrinsicHeight);
        this.f12010cdpycssgdh.draw(canvas);
    }

    private void iwizpuwonk(boolean z13) {
        removeCallbacks(this.f12044wypolnanlu);
        this.f12042vipkmwdibw = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f12039stevsuqkhv.iterator();
        while (it.hasNext()) {
            ((lmojexxdyd.iobyxmoadg) it.next()).hkdspvbjdz(this, this.f12022jhduphickx, z13);
        }
    }

    private void jyumaefscl(long j13) {
        this.f12022jhduphickx = j13;
        this.f12042vipkmwdibw = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f12039stevsuqkhv.iterator();
        while (it.hasNext()) {
            ((lmojexxdyd.iobyxmoadg) it.next()).istkbnxepw(this, j13);
        }
    }

    private void kcexrzcfyt(int i13, int i14) {
        Rect rect = this.f12038sopmlzcsov;
        if (rect != null && rect.width() == i13 && this.f12038sopmlzcsov.height() == i14) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i13, i14);
        this.f12038sopmlzcsov = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    private void lereixgezr(long j13) {
        if (this.f12022jhduphickx == j13) {
            return;
        }
        this.f12022jhduphickx = j13;
        Iterator it = this.f12039stevsuqkhv.iterator();
        while (it.hasNext()) {
            ((lmojexxdyd.iobyxmoadg) it.next()).pkzmftpjix(this, j13);
        }
    }

    private void lqeggnwhkg(Canvas canvas) {
        int iHeight = this.f12047yggfygwlhe.height();
        int iCenterY = this.f12047yggfygwlhe.centerY() - (iHeight / 2);
        int i13 = iHeight + iCenterY;
        if (this.f12018ikoacuggdj <= 0) {
            Rect rect = this.f12047yggfygwlhe;
            canvas.drawRect(rect.left, iCenterY, rect.right, i13, this.f12028lereixgezr);
            return;
        }
        Rect rect2 = this.f12025jyumaefscl;
        int i14 = rect2.left;
        int i15 = rect2.right;
        int iMax = Math.max(Math.max(this.f12047yggfygwlhe.left, i15), this.f12021iwizpuwonk.right);
        int i16 = this.f12047yggfygwlhe.right;
        if (iMax < i16) {
            canvas.drawRect(iMax, iCenterY, i16, i13, this.f12028lereixgezr);
        }
        int iMax2 = Math.max(i14, this.f12021iwizpuwonk.right);
        if (i15 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i15, i13, this.f12015esjtqupxsv);
        }
        if (this.f12021iwizpuwonk.width() > 0) {
            Rect rect3 = this.f12021iwizpuwonk;
            canvas.drawRect(rect3.left, iCenterY, rect3.right, i13, this.f12012cqumvgiudr);
        }
        if (this.f12045xrmfcynszj == 0) {
            return;
        }
        long[] jArr = (long[]) y2.iobyxmoadg.eablkybsjg(this.f12031metgxyhuhe);
        boolean[] zArr = (boolean[]) y2.iobyxmoadg.eablkybsjg(this.f12037rlfsiqarku);
        int i17 = this.f12043wwaezpbzkn / 2;
        for (int i18 = 0; i18 < this.f12045xrmfcynszj; i18++) {
            int iWidth = ((int) ((((long) this.f12047yggfygwlhe.width()) * stevsuqkhv.rgvfuqvkyq(jArr[i18], 0L, this.f12018ikoacuggdj)) / this.f12018ikoacuggdj)) - i17;
            Rect rect4 = this.f12047yggfygwlhe;
            int iMin = rect4.left + Math.min(rect4.width() - this.f12043wwaezpbzkn, Math.max(0, iWidth));
            canvas.drawRect(iMin, iCenterY, iMin + this.f12043wwaezpbzkn, i13, zArr[i18] ? this.f12050zynmafqrjb : this.f12035pmvmpeiblj);
        }
    }

    private Point ojitshcjhn(MotionEvent motionEvent) {
        this.f12027kegysxyocb.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f12027kegysxyocb;
    }

    private static boolean oxmwwwfdhm(Drawable drawable, int i13) {
        return stevsuqkhv.f123602iobyxmoadg >= 23 && drawable.setLayoutDirection(i13);
    }

    private boolean rgvfuqvkyq(long j13) {
        long j14 = this.f12018ikoacuggdj;
        if (j14 <= 0) {
            return false;
        }
        long j15 = this.f12042vipkmwdibw ? this.f12022jhduphickx : this.f12033okpsazkaxt;
        long jRgvfuqvkyq = stevsuqkhv.rgvfuqvkyq(j15 + j13, 0L, j14);
        if (jRgvfuqvkyq == j15) {
            return false;
        }
        if (this.f12042vipkmwdibw) {
            lereixgezr(jRgvfuqvkyq);
        } else {
            jyumaefscl(jRgvfuqvkyq);
        }
        cqumvgiudr();
        return true;
    }

    private boolean vdvldrhtss(Drawable drawable) {
        return stevsuqkhv.f123602iobyxmoadg >= 23 && oxmwwwfdhm(drawable, getLayoutDirection());
    }

    private void wflxmlrfwp(float f13) {
        Rect rect = this.f12021iwizpuwonk;
        Rect rect2 = this.f12047yggfygwlhe;
        rect.right = stevsuqkhv.ojitshcjhn((int) f13, rect2.left, rect2.right);
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        esjtqupxsv();
    }

    public void dxjokdxxww(boolean z13) {
        if (this.f12013crxdokpmqz.isStarted()) {
            this.f12013crxdokpmqz.cancel();
        }
        this.f12036ribwqtqdhb = z13;
        this.f12023jlmebxxoox = 0.0f;
        invalidate(this.f12049zdlpuopuiu);
    }

    @Override // androidx.media3.ui.lmojexxdyd
    public long getPreferredUpdateDelay() {
        int iAgtfadlqog = agtfadlqog(this.f12040tzroggbefp, this.f12047yggfygwlhe.width());
        if (iAgtfadlqog != 0) {
            long j13 = this.f12018ikoacuggdj;
            if (j13 != 0 && j13 != -9223372036854775807L) {
                return j13 / ((long) iAgtfadlqog);
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // androidx.media3.ui.lmojexxdyd
    public void iobyxmoadg(lmojexxdyd.iobyxmoadg iobyxmoadgVar) {
        y2.iobyxmoadg.eablkybsjg(iobyxmoadgVar);
        this.f12039stevsuqkhv.add(iobyxmoadgVar);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f12010cdpycssgdh;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void nufgyqmvbu(long j13) {
        if (this.f12013crxdokpmqz.isStarted()) {
            this.f12013crxdokpmqz.cancel();
        }
        this.f12013crxdokpmqz.setFloatValues(this.f12023jlmebxxoox, 0.0f);
        this.f12013crxdokpmqz.setDuration(j13);
        this.f12013crxdokpmqz.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        lqeggnwhkg(canvas);
        gxszxtbevo(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z13, int i13, Rect rect) {
        super.onFocusChanged(z13, i13, rect);
        if (!this.f12042vipkmwdibw || z13) {
            return;
        }
        iwizpuwonk(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f12018ikoacuggdj <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i13, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i13 != 66) {
                switch (i13) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (rgvfuqvkyq(positionIncrement)) {
                            removeCallbacks(this.f12044wypolnanlu);
                            postDelayed(this.f12044wypolnanlu, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (rgvfuqvkyq(positionIncrement)) {
                            removeCallbacks(this.f12044wypolnanlu);
                            postDelayed(this.f12044wypolnanlu, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.f12042vipkmwdibw) {
                            iwizpuwonk(false);
                            return true;
                        }
                        break;
                }
            } else if (this.f12042vipkmwdibw) {
                iwizpuwonk(false);
                return true;
            }
        }
        return super.onKeyDown(i13, keyEvent);
    }

    @Override // android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int paddingBottom;
        int iMax;
        int i17 = i15 - i13;
        int i18 = i16 - i14;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i17 - getPaddingRight();
        int i19 = this.f12036ribwqtqdhb ? 0 : this.f12024jpowsppfya;
        if (this.f12029lmojexxdyd == 1) {
            paddingBottom = (i18 - getPaddingBottom()) - this.f12019iozdgvuglv;
            int paddingBottom2 = i18 - getPaddingBottom();
            int i23 = this.f12046yadqdtsiqt;
            iMax = (paddingBottom2 - i23) - Math.max(i19 - (i23 / 2), 0);
        } else {
            paddingBottom = (i18 - this.f12019iozdgvuglv) / 2;
            iMax = (i18 - this.f12046yadqdtsiqt) / 2;
        }
        this.f12049zdlpuopuiu.set(paddingLeft, paddingBottom, paddingRight, this.f12019iozdgvuglv + paddingBottom);
        Rect rect = this.f12047yggfygwlhe;
        Rect rect2 = this.f12049zdlpuopuiu;
        rect.set(rect2.left + i19, iMax, rect2.right - i19, this.f12046yadqdtsiqt + iMax);
        if (stevsuqkhv.f123602iobyxmoadg >= 29) {
            kcexrzcfyt(i17, i18);
        }
        cqumvgiudr();
    }

    @Override // android.view.View
    protected void onMeasure(int i13, int i14) {
        int mode = View.MeasureSpec.getMode(i14);
        int size = View.MeasureSpec.getSize(i14);
        if (mode == 0) {
            size = this.f12019iozdgvuglv;
        } else if (mode != 1073741824) {
            size = Math.min(this.f12019iozdgvuglv, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i13), size);
        esjtqupxsv();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i13) {
        Drawable drawable = this.f12010cdpycssgdh;
        if (drawable == null || !oxmwwwfdhm(drawable, i13)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f12018ikoacuggdj > 0) {
            Point pointOjitshcjhn = ojitshcjhn(motionEvent);
            int i13 = pointOjitshcjhn.x;
            int i14 = pointOjitshcjhn.y;
            int action = motionEvent.getAction();
            if (action == 0) {
                float f13 = i13;
                if (btonecajqb(f13, i14)) {
                    wflxmlrfwp(f13);
                    jyumaefscl(getScrubberPosition());
                    cqumvgiudr();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.f12042vipkmwdibw) {
                    iwizpuwonk(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.f12042vipkmwdibw) {
                        iwizpuwonk(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.f12042vipkmwdibw) {
                if (i14 < this.f12017hkdspvbjdz) {
                    int i15 = this.f12041ulzqkzuiru;
                    wflxmlrfwp(i15 + ((i13 - i15) / 3));
                } else {
                    this.f12041ulzqkzuiru = i13;
                    wflxmlrfwp(i13);
                }
                lereixgezr(getScrubberPosition());
                cqumvgiudr();
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i13, Bundle bundle) {
        if (super.performAccessibilityAction(i13, bundle)) {
            return true;
        }
        if (this.f12018ikoacuggdj <= 0) {
            return false;
        }
        if (i13 == 8192) {
            if (rgvfuqvkyq(-getPositionIncrement())) {
                iwizpuwonk(false);
            }
        } else {
            if (i13 != 4096) {
                return false;
            }
            if (rgvfuqvkyq(getPositionIncrement())) {
                iwizpuwonk(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i13) {
        this.f12035pmvmpeiblj.setColor(i13);
        invalidate(this.f12049zdlpuopuiu);
    }

    public void setBufferedColor(int i13) {
        this.f12015esjtqupxsv.setColor(i13);
        invalidate(this.f12049zdlpuopuiu);
    }

    @Override // androidx.media3.ui.lmojexxdyd
    public void setBufferedPosition(long j13) {
        if (this.f12026jztzpxfvev == j13) {
            return;
        }
        this.f12026jztzpxfvev = j13;
        cqumvgiudr();
    }

    @Override // androidx.media3.ui.lmojexxdyd
    public void setDuration(long j13) {
        if (this.f12018ikoacuggdj == j13) {
            return;
        }
        this.f12018ikoacuggdj = j13;
        if (this.f12042vipkmwdibw && j13 == -9223372036854775807L) {
            iwizpuwonk(true);
        }
        cqumvgiudr();
    }

    @Override // android.view.View, androidx.media3.ui.lmojexxdyd
    public void setEnabled(boolean z13) {
        super.setEnabled(z13);
        if (!this.f12042vipkmwdibw || z13) {
            return;
        }
        iwizpuwonk(true);
    }

    public void setKeyCountIncrement(int i13) {
        y2.iobyxmoadg.iobyxmoadg(i13 > 0);
        this.f12030mbcevpiqjq = i13;
        this.f12032ntlheqmsrt = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j13) {
        y2.iobyxmoadg.iobyxmoadg(j13 > 0);
        this.f12030mbcevpiqjq = -1;
        this.f12032ntlheqmsrt = j13;
    }

    public void setPlayedAdMarkerColor(int i13) {
        this.f12050zynmafqrjb.setColor(i13);
        invalidate(this.f12049zdlpuopuiu);
    }

    public void setPlayedColor(int i13) {
        this.f12012cqumvgiudr.setColor(i13);
        invalidate(this.f12049zdlpuopuiu);
    }

    @Override // androidx.media3.ui.lmojexxdyd
    public void setPosition(long j13) {
        if (this.f12033okpsazkaxt == j13) {
            return;
        }
        this.f12033okpsazkaxt = j13;
        setContentDescription(getProgressText());
        cqumvgiudr();
    }

    public void setScrubberColor(int i13) {
        this.f12020istkbnxepw.setColor(i13);
        invalidate(this.f12049zdlpuopuiu);
    }

    public void setUnplayedColor(int i13) {
        this.f12028lereixgezr.setColor(i13);
        invalidate(this.f12049zdlpuopuiu);
    }

    public void yggfygwlhe(long j13) {
        if (this.f12013crxdokpmqz.isStarted()) {
            this.f12013crxdokpmqz.cancel();
        }
        this.f12036ribwqtqdhb = false;
        this.f12013crxdokpmqz.setFloatValues(this.f12023jlmebxxoox, 1.0f);
        this.f12013crxdokpmqz.setDuration(j13);
        this.f12013crxdokpmqz.start();
    }

    public void zdlpuopuiu() {
        if (this.f12013crxdokpmqz.isStarted()) {
            this.f12013crxdokpmqz.cancel();
        }
        this.f12036ribwqtqdhb = false;
        this.f12023jlmebxxoox = 1.0f;
        invalidate(this.f12049zdlpuopuiu);
    }

    @Override // androidx.media3.ui.lmojexxdyd
    public void zoijcleaow(long[] jArr, boolean[] zArr, int i13) {
        y2.iobyxmoadg.iobyxmoadg(i13 == 0 || !(jArr == null || zArr == null));
        this.f12045xrmfcynszj = i13;
        this.f12031metgxyhuhe = jArr;
        this.f12037rlfsiqarku = zArr;
        cqumvgiudr();
    }
}
