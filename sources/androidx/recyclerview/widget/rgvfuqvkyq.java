package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public class rgvfuqvkyq extends RecyclerView.pmvmpeiblj {
    private static final boolean DEBUG = false;
    private static final float MILLISECONDS_PER_INCH = 25.0f;
    public static final int SNAP_TO_ANY = 0;
    public static final int SNAP_TO_END = 1;
    public static final int SNAP_TO_START = -1;
    private static final float TARGET_SEEK_EXTRA_SCROLL_RATIO = 1.2f;
    private static final int TARGET_SEEK_SCROLL_DISTANCE_PX = 10000;
    private final DisplayMetrics mDisplayMetrics;
    private float mMillisPerPixel;

    @SuppressLint({"UnknownNullness"})
    protected PointF mTargetVector;
    protected final LinearInterpolator mLinearInterpolator = new LinearInterpolator();
    protected final DecelerateInterpolator mDecelerateInterpolator = new DecelerateInterpolator();
    private boolean mHasCalculatedMillisPerPixel = false;
    protected int mInterimTargetDx = 0;
    protected int mInterimTargetDy = 0;

    public rgvfuqvkyq(Context context) {
        this.mDisplayMetrics = context.getResources().getDisplayMetrics();
    }

    private int iobyxmoadg(int i13, int i14) {
        int i15 = i13 - i14;
        if (i13 * i15 <= 0) {
            return 0;
        }
        return i15;
    }

    private float zoijcleaow() {
        if (!this.mHasCalculatedMillisPerPixel) {
            this.mMillisPerPixel = calculateSpeedPerPixel(this.mDisplayMetrics);
            this.mHasCalculatedMillisPerPixel = true;
        }
        return this.mMillisPerPixel;
    }

    public int calculateDtToFit(int i13, int i14, int i15, int i16, int i17) {
        if (i17 == -1) {
            return i15 - i13;
        }
        if (i17 != 0) {
            if (i17 == 1) {
                return i16 - i14;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i18 = i15 - i13;
        if (i18 > 0) {
            return i18;
        }
        int i19 = i16 - i14;
        if (i19 < 0) {
            return i19;
        }
        return 0;
    }

    @SuppressLint({"UnknownNullness"})
    public int calculateDxToMakeVisible(View view, int i13) {
        RecyclerView.rgvfuqvkyq layoutManager = getLayoutManager();
        if (layoutManager == null || !layoutManager.pmvmpeiblj()) {
            return 0;
        }
        RecyclerView.vdvldrhtss vdvldrhtssVar = (RecyclerView.vdvldrhtss) view.getLayoutParams();
        return calculateDtToFit(layoutManager.rlfsiqarku(view) - ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).leftMargin, layoutManager.yfnezrywwk(view) + ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).rightMargin, layoutManager.getPaddingLeft(), layoutManager.iwxlajgraz() - layoutManager.getPaddingRight(), i13);
    }

    @SuppressLint({"UnknownNullness"})
    public int calculateDyToMakeVisible(View view, int i13) {
        RecyclerView.rgvfuqvkyq layoutManager = getLayoutManager();
        if (layoutManager == null || !layoutManager.zynmafqrjb()) {
            return 0;
        }
        RecyclerView.vdvldrhtss vdvldrhtssVar = (RecyclerView.vdvldrhtss) view.getLayoutParams();
        return calculateDtToFit(layoutManager.ydmasvzmpa(view) - ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).topMargin, layoutManager.xrmfcynszj(view) + ((ViewGroup.MarginLayoutParams) vdvldrhtssVar).bottomMargin, layoutManager.getPaddingTop(), layoutManager.zfvoamnweg() - layoutManager.getPaddingBottom(), i13);
    }

    protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return MILLISECONDS_PER_INCH / displayMetrics.densityDpi;
    }

    protected int calculateTimeForDeceleration(int i13) {
        return (int) Math.ceil(((double) calculateTimeForScrolling(i13)) / 0.3356d);
    }

    protected int calculateTimeForScrolling(int i13) {
        return (int) Math.ceil(Math.abs(i13) * zoijcleaow());
    }

    protected int getHorizontalSnapPreference() {
        PointF pointF = this.mTargetVector;
        if (pointF != null) {
            float f13 = pointF.x;
            if (f13 != 0.0f) {
                return f13 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    protected int getVerticalSnapPreference() {
        PointF pointF = this.mTargetVector;
        if (pointF != null) {
            float f13 = pointF.y;
            if (f13 != 0.0f) {
                return f13 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.pmvmpeiblj
    @SuppressLint({"UnknownNullness"})
    protected void onSeekTargetStep(int i13, int i14, RecyclerView.zynmafqrjb zynmafqrjbVar, RecyclerView.pmvmpeiblj.iobyxmoadg iobyxmoadgVar) {
        if (getChildCount() == 0) {
            stop();
            return;
        }
        this.mInterimTargetDx = iobyxmoadg(this.mInterimTargetDx, i13);
        int iIobyxmoadg = iobyxmoadg(this.mInterimTargetDy, i14);
        this.mInterimTargetDy = iIobyxmoadg;
        if (this.mInterimTargetDx == 0 && iIobyxmoadg == 0) {
            updateActionForInterimTarget(iobyxmoadgVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.pmvmpeiblj
    protected void onStart() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.pmvmpeiblj
    protected void onStop() {
        this.mInterimTargetDy = 0;
        this.mInterimTargetDx = 0;
        this.mTargetVector = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.pmvmpeiblj
    protected void onTargetFound(View view, RecyclerView.zynmafqrjb zynmafqrjbVar, RecyclerView.pmvmpeiblj.iobyxmoadg iobyxmoadgVar) {
        int iCalculateDxToMakeVisible = calculateDxToMakeVisible(view, getHorizontalSnapPreference());
        int iCalculateDyToMakeVisible = calculateDyToMakeVisible(view, getVerticalSnapPreference());
        int iCalculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((iCalculateDxToMakeVisible * iCalculateDxToMakeVisible) + (iCalculateDyToMakeVisible * iCalculateDyToMakeVisible)));
        if (iCalculateTimeForDeceleration > 0) {
            iobyxmoadgVar.wkgbmnqykc(-iCalculateDxToMakeVisible, -iCalculateDyToMakeVisible, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
        }
    }

    @SuppressLint({"UnknownNullness"})
    protected void updateActionForInterimTarget(RecyclerView.pmvmpeiblj.iobyxmoadg iobyxmoadgVar) {
        PointF pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(getTargetPosition());
        if (pointFComputeScrollVectorForPosition == null || (pointFComputeScrollVectorForPosition.x == 0.0f && pointFComputeScrollVectorForPosition.y == 0.0f)) {
            iobyxmoadgVar.zoijcleaow(getTargetPosition());
            stop();
            return;
        }
        normalize(pointFComputeScrollVectorForPosition);
        this.mTargetVector = pointFComputeScrollVectorForPosition;
        this.mInterimTargetDx = (int) (pointFComputeScrollVectorForPosition.x * 10000.0f);
        this.mInterimTargetDy = (int) (pointFComputeScrollVectorForPosition.y * 10000.0f);
        iobyxmoadgVar.wkgbmnqykc((int) (this.mInterimTargetDx * TARGET_SEEK_EXTRA_SCROLL_RATIO), (int) (this.mInterimTargetDy * TARGET_SEEK_EXTRA_SCROLL_RATIO), (int) (calculateTimeForScrolling(10000) * TARGET_SEEK_EXTRA_SCROLL_RATIO), this.mLinearInterpolator);
    }
}
