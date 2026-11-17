package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import i1.gtknphoqwx;
import i1.nufgyqmvbu;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class ppxfxbqfkf extends eablkybsjg implements Animatable {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    wkgbmnqykc f13678cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private Animator.AnimatorListener f13679esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private ArgbEvaluator f13680iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private Context f13681jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    ArrayList f13682lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    final Drawable.Callback f13683pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private C0204ppxfxbqfkf f13684yggfygwlhe;

    class iobyxmoadg implements Drawable.Callback {
        iobyxmoadg() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            ppxfxbqfkf.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j13) {
            ppxfxbqfkf.this.scheduleSelf(runnable, j13);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            ppxfxbqfkf.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    private static class C0204ppxfxbqfkf extends Drawable.ConstantState {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        androidx.collection.iobyxmoadg f13686eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        int f13687iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        AnimatorSet f13688ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        ArrayList f13689wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        gxszxtbevo f13690zoijcleaow;

        public C0204ppxfxbqfkf(Context context, C0204ppxfxbqfkf c0204ppxfxbqfkf, Drawable.Callback callback, Resources resources) {
            if (c0204ppxfxbqfkf != null) {
                this.f13687iobyxmoadg = c0204ppxfxbqfkf.f13687iobyxmoadg;
                gxszxtbevo gxszxtbevoVar = c0204ppxfxbqfkf.f13690zoijcleaow;
                if (gxszxtbevoVar != null) {
                    Drawable.ConstantState constantState = gxszxtbevoVar.getConstantState();
                    if (resources != null) {
                        this.f13690zoijcleaow = (gxszxtbevo) constantState.newDrawable(resources);
                    } else {
                        this.f13690zoijcleaow = (gxszxtbevo) constantState.newDrawable();
                    }
                    gxszxtbevo gxszxtbevoVar2 = (gxszxtbevo) this.f13690zoijcleaow.mutate();
                    this.f13690zoijcleaow = gxszxtbevoVar2;
                    gxszxtbevoVar2.setCallback(callback);
                    this.f13690zoijcleaow.setBounds(c0204ppxfxbqfkf.f13690zoijcleaow.getBounds());
                    this.f13690zoijcleaow.lqeggnwhkg(false);
                }
                ArrayList arrayList = c0204ppxfxbqfkf.f13689wkgbmnqykc;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f13689wkgbmnqykc = new ArrayList(size);
                    this.f13686eablkybsjg = new androidx.collection.iobyxmoadg(size);
                    for (int i13 = 0; i13 < size; i13++) {
                        Animator animator = (Animator) c0204ppxfxbqfkf.f13689wkgbmnqykc.get(i13);
                        Animator animatorClone = animator.clone();
                        String str = (String) c0204ppxfxbqfkf.f13686eablkybsjg.get(animator);
                        animatorClone.setTarget(this.f13690zoijcleaow.ppxfxbqfkf(str));
                        this.f13689wkgbmnqykc.add(animatorClone);
                        this.f13686eablkybsjg.put(animatorClone, str);
                    }
                    iobyxmoadg();
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f13687iobyxmoadg;
        }

        public void iobyxmoadg() {
            if (this.f13688ppxfxbqfkf == null) {
                this.f13688ppxfxbqfkf = new AnimatorSet();
            }
            this.f13688ppxfxbqfkf.playTogether(this.f13689wkgbmnqykc);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    class zoijcleaow extends AnimatorListenerAdapter {
        zoijcleaow() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(ppxfxbqfkf.this.f13682lereixgezr);
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                ((androidx.vectordrawable.graphics.drawable.zoijcleaow) arrayList.get(i13)).zoijcleaow(ppxfxbqfkf.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(ppxfxbqfkf.this.f13682lereixgezr);
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                ((androidx.vectordrawable.graphics.drawable.zoijcleaow) arrayList.get(i13)).ppxfxbqfkf(ppxfxbqfkf.this);
            }
        }
    }

    ppxfxbqfkf() {
        this(null, null, null);
    }

    private void eablkybsjg(String str, Animator animator) {
        animator.setTarget(this.f13684yggfygwlhe.f13690zoijcleaow.ppxfxbqfkf(str));
        C0204ppxfxbqfkf c0204ppxfxbqfkf = this.f13684yggfygwlhe;
        if (c0204ppxfxbqfkf.f13689wkgbmnqykc == null) {
            c0204ppxfxbqfkf.f13689wkgbmnqykc = new ArrayList();
            this.f13684yggfygwlhe.f13686eablkybsjg = new androidx.collection.iobyxmoadg();
        }
        this.f13684yggfygwlhe.f13689wkgbmnqykc.add(animator);
        this.f13684yggfygwlhe.f13686eablkybsjg.put(animator, str);
    }

    public static ppxfxbqfkf iobyxmoadg(Context context, int i13) {
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(context);
        Drawable drawableGxszxtbevo = nufgyqmvbu.gxszxtbevo(context.getResources(), i13, context.getTheme());
        ppxfxbqfkfVar.f13596zdlpuopuiu = drawableGxszxtbevo;
        drawableGxszxtbevo.setCallback(ppxfxbqfkfVar.f13683pmvmpeiblj);
        ppxfxbqfkfVar.f13678cqumvgiudr = new wkgbmnqykc(ppxfxbqfkfVar.f13596zdlpuopuiu.getConstantState());
        return ppxfxbqfkfVar;
    }

    private static boolean lqeggnwhkg(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.zoijcleaow zoijcleaowVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(zoijcleaowVar.iobyxmoadg());
    }

    private static void ppxfxbqfkf(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.zoijcleaow zoijcleaowVar) {
        animatedVectorDrawable.registerAnimationCallback(zoijcleaowVar.iobyxmoadg());
    }

    private void wkgbmnqykc() {
        Animator.AnimatorListener animatorListener = this.f13679esjtqupxsv;
        if (animatorListener != null) {
            this.f13684yggfygwlhe.f13688ppxfxbqfkf.removeListener(animatorListener);
            this.f13679esjtqupxsv = null;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.eablkybsjg, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            k1.iobyxmoadg.iobyxmoadg(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            return k1.iobyxmoadg.zoijcleaow(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.eablkybsjg, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f13684yggfygwlhe.f13690zoijcleaow.draw(canvas);
        if (this.f13684yggfygwlhe.f13688ppxfxbqfkf.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f13596zdlpuopuiu;
        return drawable != null ? k1.iobyxmoadg.wkgbmnqykc(drawable) : this.f13684yggfygwlhe.f13690zoijcleaow.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f13596zdlpuopuiu;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f13684yggfygwlhe.f13687iobyxmoadg;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f13596zdlpuopuiu;
        return drawable != null ? k1.iobyxmoadg.eablkybsjg(drawable) : this.f13684yggfygwlhe.f13690zoijcleaow.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f13596zdlpuopuiu != null) {
            return new wkgbmnqykc(this.f13596zdlpuopuiu.getConstantState());
        }
        return null;
    }

    @Override // androidx.vectordrawable.graphics.drawable.eablkybsjg, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f13596zdlpuopuiu;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f13684yggfygwlhe.f13690zoijcleaow.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f13596zdlpuopuiu;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f13684yggfygwlhe.f13690zoijcleaow.getIntrinsicWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.eablkybsjg, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.eablkybsjg, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f13596zdlpuopuiu;
        return drawable != null ? drawable.getOpacity() : this.f13684yggfygwlhe.f13690zoijcleaow.getOpacity();
    }

    @Override // androidx.vectordrawable.graphics.drawable.eablkybsjg, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.eablkybsjg, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.eablkybsjg, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public boolean gxszxtbevo(androidx.vectordrawable.graphics.drawable.zoijcleaow zoijcleaowVar) {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            lqeggnwhkg((AnimatedVectorDrawable) drawable, zoijcleaowVar);
        }
        ArrayList arrayList = this.f13682lereixgezr;
        if (arrayList == null || zoijcleaowVar == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(zoijcleaowVar);
        if (this.f13682lereixgezr.size() == 0) {
            wkgbmnqykc();
        }
        return zRemove;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            k1.iobyxmoadg.lqeggnwhkg(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayVdvldrhtss = gtknphoqwx.vdvldrhtss(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.iobyxmoadg.f13669eablkybsjg);
                    int resourceId = typedArrayVdvldrhtss.getResourceId(0, 0);
                    if (resourceId != 0) {
                        gxszxtbevo gxszxtbevoVarZoijcleaow = gxszxtbevo.zoijcleaow(resources, resourceId, theme);
                        gxszxtbevoVarZoijcleaow.lqeggnwhkg(false);
                        gxszxtbevoVarZoijcleaow.setCallback(this.f13683pmvmpeiblj);
                        gxszxtbevo gxszxtbevoVar = this.f13684yggfygwlhe.f13690zoijcleaow;
                        if (gxszxtbevoVar != null) {
                            gxszxtbevoVar.setCallback(null);
                        }
                        this.f13684yggfygwlhe.f13690zoijcleaow = gxszxtbevoVarZoijcleaow;
                    }
                    typedArrayVdvldrhtss.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.iobyxmoadg.f13671gxszxtbevo);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f13681jyumaefscl;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        eablkybsjg(string, androidx.vectordrawable.graphics.drawable.wkgbmnqykc.iobyxmoadg(context, resourceId2));
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f13684yggfygwlhe.iobyxmoadg();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f13596zdlpuopuiu;
        return drawable != null ? k1.iobyxmoadg.nufgyqmvbu(drawable) : this.f13684yggfygwlhe.f13690zoijcleaow.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f13596zdlpuopuiu;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f13684yggfygwlhe.f13688ppxfxbqfkf.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f13596zdlpuopuiu;
        return drawable != null ? drawable.isStateful() : this.f13684yggfygwlhe.f13690zoijcleaow.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.eablkybsjg, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f13684yggfygwlhe.f13690zoijcleaow.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.eablkybsjg, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i13) {
        Drawable drawable = this.f13596zdlpuopuiu;
        return drawable != null ? drawable.setLevel(i13) : this.f13684yggfygwlhe.f13690zoijcleaow.setLevel(i13);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f13596zdlpuopuiu;
        return drawable != null ? drawable.setState(iArr) : this.f13684yggfygwlhe.f13690zoijcleaow.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i13) {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            drawable.setAlpha(i13);
        } else {
            this.f13684yggfygwlhe.f13690zoijcleaow.setAlpha(i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z13) {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            k1.iobyxmoadg.btonecajqb(drawable, z13);
        } else {
            this.f13684yggfygwlhe.f13690zoijcleaow.setAutoMirrored(z13);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.eablkybsjg, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i13) {
        super.setChangingConfigurations(i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.eablkybsjg, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i13, PorterDuff.Mode mode) {
        super.setColorFilter(i13, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.eablkybsjg, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z13) {
        super.setFilterBitmap(z13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.eablkybsjg, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f13, float f14) {
        super.setHotspot(f13, f14);
    }

    @Override // androidx.vectordrawable.graphics.drawable.eablkybsjg, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i13, int i14, int i15, int i16) {
        super.setHotspotBounds(i13, i14, i15, i16);
    }

    @Override // androidx.vectordrawable.graphics.drawable.eablkybsjg, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i13) {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            k1.iobyxmoadg.agtfadlqog(drawable, i13);
        } else {
            this.f13684yggfygwlhe.f13690zoijcleaow.setTint(i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            k1.iobyxmoadg.ojitshcjhn(drawable, colorStateList);
        } else {
            this.f13684yggfygwlhe.f13690zoijcleaow.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            k1.iobyxmoadg.rgvfuqvkyq(drawable, mode);
        } else {
            this.f13684yggfygwlhe.f13690zoijcleaow.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z13, boolean z14) {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            return drawable.setVisible(z13, z14);
        }
        this.f13684yggfygwlhe.f13690zoijcleaow.setVisible(z13, z14);
        return super.setVisible(z13, z14);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f13684yggfygwlhe.f13688ppxfxbqfkf.isStarted()) {
                return;
            }
            this.f13684yggfygwlhe.f13688ppxfxbqfkf.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f13684yggfygwlhe.f13688ppxfxbqfkf.end();
        }
    }

    public void zoijcleaow(androidx.vectordrawable.graphics.drawable.zoijcleaow zoijcleaowVar) {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            ppxfxbqfkf((AnimatedVectorDrawable) drawable, zoijcleaowVar);
            return;
        }
        if (zoijcleaowVar == null) {
            return;
        }
        if (this.f13682lereixgezr == null) {
            this.f13682lereixgezr = new ArrayList();
        }
        if (this.f13682lereixgezr.contains(zoijcleaowVar)) {
            return;
        }
        this.f13682lereixgezr.add(zoijcleaowVar);
        if (this.f13679esjtqupxsv == null) {
            this.f13679esjtqupxsv = new zoijcleaow();
        }
        this.f13684yggfygwlhe.f13688ppxfxbqfkf.addListener(this.f13679esjtqupxsv);
    }

    private ppxfxbqfkf(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f13596zdlpuopuiu;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f13684yggfygwlhe.f13690zoijcleaow.setColorFilter(colorFilter);
        }
    }

    private static class wkgbmnqykc extends Drawable.ConstantState {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Drawable.ConstantState f13691iobyxmoadg;

        public wkgbmnqykc(Drawable.ConstantState constantState) {
            this.f13691iobyxmoadg = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f13691iobyxmoadg.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f13691iobyxmoadg.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf();
            Drawable drawableNewDrawable = this.f13691iobyxmoadg.newDrawable();
            ppxfxbqfkfVar.f13596zdlpuopuiu = drawableNewDrawable;
            drawableNewDrawable.setCallback(ppxfxbqfkfVar.f13683pmvmpeiblj);
            return ppxfxbqfkfVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf();
            Drawable drawableNewDrawable = this.f13691iobyxmoadg.newDrawable(resources);
            ppxfxbqfkfVar.f13596zdlpuopuiu = drawableNewDrawable;
            drawableNewDrawable.setCallback(ppxfxbqfkfVar.f13683pmvmpeiblj);
            return ppxfxbqfkfVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf();
            Drawable drawableNewDrawable = this.f13691iobyxmoadg.newDrawable(resources, theme);
            ppxfxbqfkfVar.f13596zdlpuopuiu = drawableNewDrawable;
            drawableNewDrawable.setCallback(ppxfxbqfkfVar.f13683pmvmpeiblj);
            return ppxfxbqfkfVar;
        }
    }

    private ppxfxbqfkf(Context context, C0204ppxfxbqfkf c0204ppxfxbqfkf, Resources resources) {
        this.f13680iwizpuwonk = null;
        this.f13679esjtqupxsv = null;
        this.f13682lereixgezr = null;
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
        this.f13683pmvmpeiblj = iobyxmoadgVar;
        this.f13681jyumaefscl = context;
        if (c0204ppxfxbqfkf != null) {
            this.f13684yggfygwlhe = c0204ppxfxbqfkf;
        } else {
            this.f13684yggfygwlhe = new C0204ppxfxbqfkf(context, c0204ppxfxbqfkf, iobyxmoadgVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
