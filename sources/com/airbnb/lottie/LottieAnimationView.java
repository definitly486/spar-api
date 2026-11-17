package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private static final hkdspvbjdz f20295hcddaimhww = new hkdspvbjdz() { // from class: com.airbnb.lottie.lqeggnwhkg
        @Override // com.airbnb.lottie.hkdspvbjdz
        public final void iobyxmoadg(Object obj) {
            LottieAnimationView.kcexrzcfyt((Throwable) obj);
        }
    };

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private static final String f20296pkzmftpjix = "LottieAnimationView";

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private boolean f20297cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final hkdspvbjdz f20298cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private hkdspvbjdz f20299esjtqupxsv;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private boolean f20300iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private int f20301istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final hkdspvbjdz f20302iwizpuwonk;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f20303lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final Set f20304lmojexxdyd;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final hcddaimhww f20305pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private final Set f20306wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private boolean f20307yadqdtsiqt;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private kegysxyocb f20308ylkuphrtab;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private String f20309zynmafqrjb;

    private static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        String f20310cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f20311esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        boolean f20312iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        float f20313jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f20314lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f20315yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        String f20316zdlpuopuiu;

        class iobyxmoadg implements Parcelable.Creator {
            iobyxmoadg() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i13) {
                return new SavedState[i13];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, dxjokdxxww dxjokdxxwwVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeString(this.f20316zdlpuopuiu);
            parcel.writeFloat(this.f20313jyumaefscl);
            parcel.writeInt(this.f20312iwizpuwonk ? 1 : 0);
            parcel.writeString(this.f20310cqumvgiudr);
            parcel.writeInt(this.f20311esjtqupxsv);
            parcel.writeInt(this.f20314lereixgezr);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f20316zdlpuopuiu = parcel.readString();
            this.f20313jyumaefscl = parcel.readFloat();
            this.f20312iwizpuwonk = parcel.readInt() == 1;
            this.f20310cqumvgiudr = parcel.readString();
            this.f20311esjtqupxsv = parcel.readInt();
            this.f20314lereixgezr = parcel.readInt();
        }
    }

    private enum iobyxmoadg {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    private static class ppxfxbqfkf implements hkdspvbjdz {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final WeakReference f20324iobyxmoadg;

        public ppxfxbqfkf(LottieAnimationView lottieAnimationView) {
            this.f20324iobyxmoadg = new WeakReference(lottieAnimationView);
        }

        @Override // com.airbnb.lottie.hkdspvbjdz
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public void iobyxmoadg(btonecajqb btonecajqbVar) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f20324iobyxmoadg.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setComposition(btonecajqbVar);
        }
    }

    private static class zoijcleaow implements hkdspvbjdz {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final WeakReference f20325iobyxmoadg;

        public zoijcleaow(LottieAnimationView lottieAnimationView) {
            this.f20325iobyxmoadg = new WeakReference(lottieAnimationView);
        }

        @Override // com.airbnb.lottie.hkdspvbjdz
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public void iobyxmoadg(Throwable th2) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f20325iobyxmoadg.get();
            if (lottieAnimationView == null) {
                return;
            }
            if (lottieAnimationView.f20303lereixgezr != 0) {
                lottieAnimationView.setImageResource(lottieAnimationView.f20303lereixgezr);
            }
            (lottieAnimationView.f20299esjtqupxsv == null ? LottieAnimationView.f20295hcddaimhww : lottieAnimationView.f20299esjtqupxsv).iobyxmoadg(th2);
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20302iwizpuwonk = new ppxfxbqfkf(this);
        this.f20298cqumvgiudr = new zoijcleaow(this);
        this.f20303lereixgezr = 0;
        this.f20305pmvmpeiblj = new hcddaimhww();
        this.f20297cdpycssgdh = false;
        this.f20307yadqdtsiqt = false;
        this.f20300iozdgvuglv = true;
        this.f20304lmojexxdyd = new HashSet();
        this.f20306wwaezpbzkn = new HashSet();
        ojitshcjhn(attributeSet, mbcevpiqjq.lottieAnimationViewStyle);
    }

    private kegysxyocb agtfadlqog(final int i13) {
        if (isInEditMode()) {
            return new kegysxyocb(new Callable() { // from class: com.airbnb.lottie.nufgyqmvbu
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f20492iobyxmoadg.oxmwwwfdhm(i13);
                }
            }, true);
        }
        return this.f20300iozdgvuglv ? zdlpuopuiu.jyumaefscl(getContext(), i13) : zdlpuopuiu.iwizpuwonk(getContext(), i13, null);
    }

    private void btonecajqb() {
        kegysxyocb kegysxyocbVar = this.f20308ylkuphrtab;
        if (kegysxyocbVar != null) {
            kegysxyocbVar.gtknphoqwx(this.f20302iwizpuwonk);
            this.f20308ylkuphrtab.btonecajqb(this.f20298cqumvgiudr);
        }
    }

    private void cqumvgiudr() {
        boolean zRgvfuqvkyq = rgvfuqvkyq();
        setImageDrawable(null);
        setImageDrawable(this.f20305pmvmpeiblj);
        if (zRgvfuqvkyq) {
            this.f20305pmvmpeiblj.iwxlajgraz();
        }
    }

    private void esjtqupxsv(float f13, boolean z13) {
        if (z13) {
            this.f20304lmojexxdyd.add(iobyxmoadg.SET_PROGRESS);
        }
        this.f20305pmvmpeiblj.e(f13);
    }

    private void gtknphoqwx() {
        this.f20305pmvmpeiblj.zdlpuopuiu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void kcexrzcfyt(Throwable th2) {
        if (!v7.btonecajqb.gtknphoqwx(th2)) {
            throw new IllegalStateException("Unable to parse composition", th2);
        }
        v7.wkgbmnqykc.wkgbmnqykc("Unable to load composition.", th2);
    }

    private void ojitshcjhn(AttributeSet attributeSet, int i13) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ntlheqmsrt.LottieAnimationView, i13, 0);
        this.f20300iozdgvuglv = typedArrayObtainStyledAttributes.getBoolean(ntlheqmsrt.LottieAnimationView_lottie_cacheComposition, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(ntlheqmsrt.LottieAnimationView_lottie_rawRes);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(ntlheqmsrt.LottieAnimationView_lottie_fileName);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(ntlheqmsrt.LottieAnimationView_lottie_url);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(ntlheqmsrt.LottieAnimationView_lottie_rawRes, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(ntlheqmsrt.LottieAnimationView_lottie_fileName);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(ntlheqmsrt.LottieAnimationView_lottie_url)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(ntlheqmsrt.LottieAnimationView_lottie_fallbackRes, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(ntlheqmsrt.LottieAnimationView_lottie_autoPlay, false)) {
            this.f20307yadqdtsiqt = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(ntlheqmsrt.LottieAnimationView_lottie_loop, false)) {
            this.f20305pmvmpeiblj.g(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(ntlheqmsrt.LottieAnimationView_lottie_repeatMode)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(ntlheqmsrt.LottieAnimationView_lottie_repeatMode, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(ntlheqmsrt.LottieAnimationView_lottie_repeatCount)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(ntlheqmsrt.LottieAnimationView_lottie_repeatCount, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(ntlheqmsrt.LottieAnimationView_lottie_speed)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(ntlheqmsrt.LottieAnimationView_lottie_speed, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(ntlheqmsrt.LottieAnimationView_lottie_clipToCompositionBounds)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(ntlheqmsrt.LottieAnimationView_lottie_clipToCompositionBounds, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(ntlheqmsrt.LottieAnimationView_lottie_clipTextToBoundingBox)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(ntlheqmsrt.LottieAnimationView_lottie_clipTextToBoundingBox, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(ntlheqmsrt.LottieAnimationView_lottie_defaultFontFileExtension)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(ntlheqmsrt.LottieAnimationView_lottie_defaultFontFileExtension));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(ntlheqmsrt.LottieAnimationView_lottie_imageAssetsFolder));
        esjtqupxsv(typedArrayObtainStyledAttributes.getFloat(ntlheqmsrt.LottieAnimationView_lottie_progress, 0.0f), typedArrayObtainStyledAttributes.hasValue(ntlheqmsrt.LottieAnimationView_lottie_progress));
        draadjrbmk(typedArrayObtainStyledAttributes.getBoolean(ntlheqmsrt.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        if (typedArrayObtainStyledAttributes.hasValue(ntlheqmsrt.LottieAnimationView_lottie_colorFilter)) {
            dxjokdxxww(new o7.eablkybsjg("**"), dsvhmnatus.f20367hcddaimhww, new w7.ppxfxbqfkf(new sopmlzcsov(nufgyqmvbu.iobyxmoadg.iobyxmoadg(getContext(), typedArrayObtainStyledAttributes.getResourceId(ntlheqmsrt.LottieAnimationView_lottie_colorFilter, -1)).getDefaultColor())));
        }
        if (typedArrayObtainStyledAttributes.hasValue(ntlheqmsrt.LottieAnimationView_lottie_renderMode)) {
            int i14 = ntlheqmsrt.LottieAnimationView_lottie_renderMode;
            ulzqkzuiru ulzqkzuiruVar = ulzqkzuiru.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(i14, ulzqkzuiruVar.ordinal());
            if (iOrdinal >= ulzqkzuiru.values().length) {
                iOrdinal = ulzqkzuiruVar.ordinal();
            }
            setRenderMode(ulzqkzuiru.values()[iOrdinal]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(ntlheqmsrt.LottieAnimationView_lottie_asyncUpdates)) {
            int i15 = ntlheqmsrt.LottieAnimationView_lottie_asyncUpdates;
            com.airbnb.lottie.iobyxmoadg iobyxmoadgVar = com.airbnb.lottie.iobyxmoadg.AUTOMATIC;
            int iOrdinal2 = typedArrayObtainStyledAttributes.getInt(i15, iobyxmoadgVar.ordinal());
            if (iOrdinal2 >= ulzqkzuiru.values().length) {
                iOrdinal2 = iobyxmoadgVar.ordinal();
            }
            setAsyncUpdates(com.airbnb.lottie.iobyxmoadg.values()[iOrdinal2]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(ntlheqmsrt.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
        if (typedArrayObtainStyledAttributes.hasValue(ntlheqmsrt.LottieAnimationView_lottie_useCompositionFrameRate)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(ntlheqmsrt.LottieAnimationView_lottie_useCompositionFrameRate, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f20305pmvmpeiblj.k(Boolean.valueOf(v7.btonecajqb.gxszxtbevo(getContext()) != 0.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ wypolnanlu oxmwwwfdhm(int i13) {
        return this.f20300iozdgvuglv ? zdlpuopuiu.cqumvgiudr(getContext(), i13) : zdlpuopuiu.esjtqupxsv(getContext(), i13, null);
    }

    private void setCompositionTask(kegysxyocb kegysxyocbVar) {
        wypolnanlu wypolnanluVarEablkybsjg = kegysxyocbVar.eablkybsjg();
        hcddaimhww hcddaimhwwVar = this.f20305pmvmpeiblj;
        if (wypolnanluVarEablkybsjg != null && hcddaimhwwVar == getDrawable() && hcddaimhwwVar.pkzmftpjix() == wypolnanluVarEablkybsjg.zoijcleaow()) {
            return;
        }
        this.f20304lmojexxdyd.add(iobyxmoadg.SET_ANIMATION);
        gtknphoqwx();
        btonecajqb();
        this.f20308ylkuphrtab = kegysxyocbVar.wkgbmnqykc(this.f20302iwizpuwonk).ppxfxbqfkf(this.f20298cqumvgiudr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ wypolnanlu vdvldrhtss(String str) {
        return this.f20300iozdgvuglv ? zdlpuopuiu.ojitshcjhn(getContext(), str) : zdlpuopuiu.rgvfuqvkyq(getContext(), str, null);
    }

    private kegysxyocb wflxmlrfwp(final String str) {
        if (isInEditMode()) {
            return new kegysxyocb(new Callable() { // from class: com.airbnb.lottie.gxszxtbevo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f20412iobyxmoadg.vdvldrhtss(str);
                }
            }, true);
        }
        return this.f20300iozdgvuglv ? zdlpuopuiu.wflxmlrfwp(getContext(), str) : zdlpuopuiu.agtfadlqog(getContext(), str, null);
    }

    public void draadjrbmk(boolean z13) {
        this.f20305pmvmpeiblj.lereixgezr(z13);
    }

    public void dxjokdxxww(o7.eablkybsjg eablkybsjgVar, Object obj, w7.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f20305pmvmpeiblj.vdvldrhtss(eablkybsjgVar, obj, ppxfxbqfkfVar);
    }

    public com.airbnb.lottie.iobyxmoadg getAsyncUpdates() {
        return this.f20305pmvmpeiblj.yadqdtsiqt();
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.f20305pmvmpeiblj.iozdgvuglv();
    }

    public boolean getClipTextToBoundingBox() {
        return this.f20305pmvmpeiblj.wwaezpbzkn();
    }

    public boolean getClipToCompositionBounds() {
        return this.f20305pmvmpeiblj.ylkuphrtab();
    }

    public btonecajqb getComposition() {
        Drawable drawable = getDrawable();
        hcddaimhww hcddaimhwwVar = this.f20305pmvmpeiblj;
        if (drawable == hcddaimhwwVar) {
            return hcddaimhwwVar.pkzmftpjix();
        }
        return null;
    }

    public long getDuration() {
        btonecajqb composition = getComposition();
        if (composition != null) {
            return (long) composition.wkgbmnqykc();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f20305pmvmpeiblj.hkdspvbjdz();
    }

    public String getImageAssetsFolder() {
        return this.f20305pmvmpeiblj.dsvhmnatus();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f20305pmvmpeiblj.stevsuqkhv();
    }

    public float getMaxFrame() {
        return this.f20305pmvmpeiblj.tzroggbefp();
    }

    public float getMinFrame() {
        return this.f20305pmvmpeiblj.mbcevpiqjq();
    }

    public tzroggbefp getPerformanceTracker() {
        return this.f20305pmvmpeiblj.ntlheqmsrt();
    }

    public float getProgress() {
        return this.f20305pmvmpeiblj.ulzqkzuiru();
    }

    public ulzqkzuiru getRenderMode() {
        return this.f20305pmvmpeiblj.sopmlzcsov();
    }

    public int getRepeatCount() {
        return this.f20305pmvmpeiblj.crxdokpmqz();
    }

    public int getRepeatMode() {
        return this.f20305pmvmpeiblj.jlmebxxoox();
    }

    public float getSpeed() {
        return this.f20305pmvmpeiblj.ribwqtqdhb();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof hcddaimhww) && ((hcddaimhww) drawable).sopmlzcsov() == ulzqkzuiru.SOFTWARE) {
            this.f20305pmvmpeiblj.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        hcddaimhww hcddaimhwwVar = this.f20305pmvmpeiblj;
        if (drawable2 == hcddaimhwwVar) {
            super.invalidateDrawable(hcddaimhwwVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void iwizpuwonk(String str, String str2) {
        jyumaefscl(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void jyumaefscl(InputStream inputStream, String str) {
        setCompositionTask(zdlpuopuiu.vdvldrhtss(inputStream, str));
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f20307yadqdtsiqt) {
            return;
        }
        this.f20305pmvmpeiblj.roivzttewh();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i13;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f20309zynmafqrjb = savedState.f20316zdlpuopuiu;
        Set set = this.f20304lmojexxdyd;
        iobyxmoadg iobyxmoadgVar = iobyxmoadg.SET_ANIMATION;
        if (!set.contains(iobyxmoadgVar) && !TextUtils.isEmpty(this.f20309zynmafqrjb)) {
            setAnimation(this.f20309zynmafqrjb);
        }
        this.f20301istkbnxepw = savedState.f20315yggfygwlhe;
        if (!this.f20304lmojexxdyd.contains(iobyxmoadgVar) && (i13 = this.f20301istkbnxepw) != 0) {
            setAnimation(i13);
        }
        if (!this.f20304lmojexxdyd.contains(iobyxmoadg.SET_PROGRESS)) {
            esjtqupxsv(savedState.f20313jyumaefscl, false);
        }
        if (!this.f20304lmojexxdyd.contains(iobyxmoadg.PLAY_OPTION) && savedState.f20312iwizpuwonk) {
            yggfygwlhe();
        }
        if (!this.f20304lmojexxdyd.contains(iobyxmoadg.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.f20310cqumvgiudr);
        }
        if (!this.f20304lmojexxdyd.contains(iobyxmoadg.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.f20311esjtqupxsv);
        }
        if (this.f20304lmojexxdyd.contains(iobyxmoadg.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.f20314lereixgezr);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f20316zdlpuopuiu = this.f20309zynmafqrjb;
        savedState.f20315yggfygwlhe = this.f20301istkbnxepw;
        savedState.f20313jyumaefscl = this.f20305pmvmpeiblj.ulzqkzuiru();
        savedState.f20312iwizpuwonk = this.f20305pmvmpeiblj.jztzpxfvev();
        savedState.f20310cqumvgiudr = this.f20305pmvmpeiblj.dsvhmnatus();
        savedState.f20311esjtqupxsv = this.f20305pmvmpeiblj.jlmebxxoox();
        savedState.f20314lereixgezr = this.f20305pmvmpeiblj.crxdokpmqz();
        return savedState;
    }

    public boolean rgvfuqvkyq() {
        return this.f20305pmvmpeiblj.okpsazkaxt();
    }

    public void setAnimation(int i13) {
        this.f20301istkbnxepw = i13;
        this.f20309zynmafqrjb = null;
        setCompositionTask(agtfadlqog(i13));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        iwizpuwonk(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f20300iozdgvuglv ? zdlpuopuiu.lereixgezr(getContext(), str) : zdlpuopuiu.pmvmpeiblj(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z13) {
        this.f20305pmvmpeiblj.skhdrjzrfn(z13);
    }

    public void setAsyncUpdates(com.airbnb.lottie.iobyxmoadg iobyxmoadgVar) {
        this.f20305pmvmpeiblj.igdgnonuha(iobyxmoadgVar);
    }

    public void setCacheComposition(boolean z13) {
        this.f20300iozdgvuglv = z13;
    }

    public void setClipTextToBoundingBox(boolean z13) {
        this.f20305pmvmpeiblj.lxfrhoxuzk(z13);
    }

    public void setClipToCompositionBounds(boolean z13) {
        this.f20305pmvmpeiblj.wizcaqwiak(z13);
    }

    public void setComposition(btonecajqb btonecajqbVar) {
        if (eablkybsjg.f20401iobyxmoadg) {
            Log.v(f20296pkzmftpjix, "Set Composition \n" + btonecajqbVar);
        }
        this.f20305pmvmpeiblj.setCallback(this);
        this.f20297cdpycssgdh = true;
        boolean zHszhottldk = this.f20305pmvmpeiblj.hszhottldk(btonecajqbVar);
        if (this.f20307yadqdtsiqt) {
            this.f20305pmvmpeiblj.roivzttewh();
        }
        this.f20297cdpycssgdh = false;
        if (getDrawable() != this.f20305pmvmpeiblj || zHszhottldk) {
            if (!zHszhottldk) {
                cqumvgiudr();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it = this.f20306wwaezpbzkn.iterator();
            if (it.hasNext()) {
                androidx.appcompat.app.yggfygwlhe.iobyxmoadg(it.next());
                throw null;
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.f20305pmvmpeiblj.fiwbwshyhd(str);
    }

    public void setFailureListener(hkdspvbjdz hkdspvbjdzVar) {
        this.f20299esjtqupxsv = hkdspvbjdzVar;
    }

    public void setFallbackResource(int i13) {
        this.f20303lereixgezr = i13;
    }

    public void setFontAssetDelegate(com.airbnb.lottie.zoijcleaow zoijcleaowVar) {
        this.f20305pmvmpeiblj.ageimvtcrz(zoijcleaowVar);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.f20305pmvmpeiblj.fyldjkxazc(map);
    }

    public void setFrame(int i13) {
        this.f20305pmvmpeiblj.ipoelvxyzq(i13);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z13) {
        this.f20305pmvmpeiblj.grlcpdaxtj(z13);
    }

    public void setImageAssetDelegate(com.airbnb.lottie.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f20305pmvmpeiblj.mhtqkkgtqm(ppxfxbqfkfVar);
    }

    public void setImageAssetsFolder(String str) {
        this.f20305pmvmpeiblj.ixidwrxhsl(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f20301istkbnxepw = 0;
        this.f20309zynmafqrjb = null;
        btonecajqb();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f20301istkbnxepw = 0;
        this.f20309zynmafqrjb = null;
        btonecajqb();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i13) {
        this.f20301istkbnxepw = 0;
        this.f20309zynmafqrjb = null;
        btonecajqb();
        super.setImageResource(i13);
    }

    public void setMaintainOriginalImageBounds(boolean z13) {
        this.f20305pmvmpeiblj.jrbgnlbqoe(z13);
    }

    public void setMaxFrame(int i13) {
        this.f20305pmvmpeiblj.fmlbqenlif(i13);
    }

    public void setMaxProgress(float f13) {
        this.f20305pmvmpeiblj.rhgxfdycjh(f13);
    }

    public void setMinAndMaxFrame(String str) {
        this.f20305pmvmpeiblj.eslsurpljm(str);
    }

    public void setMinFrame(int i13) {
        this.f20305pmvmpeiblj.krqnebusok(i13);
    }

    public void setMinProgress(float f13) {
        this.f20305pmvmpeiblj.b(f13);
    }

    public void setOutlineMasksAndMattes(boolean z13) {
        this.f20305pmvmpeiblj.c(z13);
    }

    public void setPerformanceTrackingEnabled(boolean z13) {
        this.f20305pmvmpeiblj.d(z13);
    }

    public void setProgress(float f13) {
        esjtqupxsv(f13, true);
    }

    public void setRenderMode(ulzqkzuiru ulzqkzuiruVar) {
        this.f20305pmvmpeiblj.f(ulzqkzuiruVar);
    }

    public void setRepeatCount(int i13) {
        this.f20304lmojexxdyd.add(iobyxmoadg.SET_REPEAT_COUNT);
        this.f20305pmvmpeiblj.g(i13);
    }

    public void setRepeatMode(int i13) {
        this.f20304lmojexxdyd.add(iobyxmoadg.SET_REPEAT_MODE);
        this.f20305pmvmpeiblj.h(i13);
    }

    public void setSafeMode(boolean z13) {
        this.f20305pmvmpeiblj.i(z13);
    }

    public void setSpeed(float f13) {
        this.f20305pmvmpeiblj.j(f13);
    }

    public void setTextDelegate(crxdokpmqz crxdokpmqzVar) {
        this.f20305pmvmpeiblj.l(crxdokpmqzVar);
    }

    public void setUseCompositionFrameRate(boolean z13) {
        this.f20305pmvmpeiblj.m(z13);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        hcddaimhww hcddaimhwwVar;
        if (!this.f20297cdpycssgdh && drawable == (hcddaimhwwVar = this.f20305pmvmpeiblj) && hcddaimhwwVar.okpsazkaxt()) {
            zdlpuopuiu();
        } else if (!this.f20297cdpycssgdh && (drawable instanceof hcddaimhww)) {
            hcddaimhww hcddaimhwwVar2 = (hcddaimhww) drawable;
            if (hcddaimhwwVar2.okpsazkaxt()) {
                hcddaimhwwVar2.tbqsvytpvh();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void yggfygwlhe() {
        this.f20304lmojexxdyd.add(iobyxmoadg.PLAY_OPTION);
        this.f20305pmvmpeiblj.roivzttewh();
    }

    public void zdlpuopuiu() {
        this.f20307yadqdtsiqt = false;
        this.f20305pmvmpeiblj.tbqsvytpvh();
    }

    public void setMaxFrame(String str) {
        this.f20305pmvmpeiblj.ezmngbhpjk(str);
    }

    public void setMinFrame(String str) {
        this.f20305pmvmpeiblj.a(str);
    }

    public void setAnimation(String str) {
        this.f20309zynmafqrjb = str;
        this.f20301istkbnxepw = 0;
        setCompositionTask(wflxmlrfwp(str));
    }
}
