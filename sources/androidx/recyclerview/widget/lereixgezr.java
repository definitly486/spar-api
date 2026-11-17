package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lereixgezr extends RecyclerView.kcexrzcfyt {
    static final float MILLISECONDS_PER_INCH = 100.0f;
    private Scroller mGravityScroller;
    RecyclerView mRecyclerView;
    private final RecyclerView.yggfygwlhe mScrollListener = new iobyxmoadg();

    class iobyxmoadg extends RecyclerView.yggfygwlhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        boolean f13028iobyxmoadg = false;

        iobyxmoadg() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.yggfygwlhe
        public void onScrollStateChanged(RecyclerView recyclerView, int i13) {
            super.onScrollStateChanged(recyclerView, i13);
            if (i13 == 0 && this.f13028iobyxmoadg) {
                this.f13028iobyxmoadg = false;
                lereixgezr.this.snapToTargetExistingView();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.yggfygwlhe
        public void onScrolled(RecyclerView recyclerView, int i13, int i14) {
            if (i13 == 0 && i14 == 0) {
                return;
            }
            this.f13028iobyxmoadg = true;
        }
    }

    class zoijcleaow extends rgvfuqvkyq {
        zoijcleaow(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.rgvfuqvkyq
        protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return lereixgezr.MILLISECONDS_PER_INCH / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.rgvfuqvkyq, androidx.recyclerview.widget.RecyclerView.pmvmpeiblj
        protected void onTargetFound(View view, RecyclerView.zynmafqrjb zynmafqrjbVar, RecyclerView.pmvmpeiblj.iobyxmoadg iobyxmoadgVar) {
            lereixgezr lereixgezrVar = lereixgezr.this;
            RecyclerView recyclerView = lereixgezrVar.mRecyclerView;
            if (recyclerView == null) {
                return;
            }
            int[] iArrCalculateDistanceToFinalSnap = lereixgezrVar.calculateDistanceToFinalSnap(recyclerView.getLayoutManager(), view);
            int i13 = iArrCalculateDistanceToFinalSnap[0];
            int i14 = iArrCalculateDistanceToFinalSnap[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i13), Math.abs(i14)));
            if (iCalculateTimeForDeceleration > 0) {
                iobyxmoadgVar.wkgbmnqykc(i13, i14, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    private void iobyxmoadg() {
        this.mRecyclerView.r(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(null);
    }

    private boolean ppxfxbqfkf(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar, int i13, int i14) {
        RecyclerView.pmvmpeiblj pmvmpeibljVarCreateScroller;
        int iFindTargetSnapPosition;
        if (!(rgvfuqvkyqVar instanceof RecyclerView.pmvmpeiblj.zoijcleaow) || (pmvmpeibljVarCreateScroller = createScroller(rgvfuqvkyqVar)) == null || (iFindTargetSnapPosition = findTargetSnapPosition(rgvfuqvkyqVar, i13, i14)) == -1) {
            return false;
        }
        pmvmpeibljVarCreateScroller.setTargetPosition(iFindTargetSnapPosition);
        rgvfuqvkyqVar.c0(pmvmpeibljVarCreateScroller);
        return true;
    }

    private void zoijcleaow() {
        if (this.mRecyclerView.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.mRecyclerView.agtfadlqog(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(this);
    }

    public void attachToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            iobyxmoadg();
        }
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            zoijcleaow();
            this.mGravityScroller = new Scroller(this.mRecyclerView.getContext(), new DecelerateInterpolator());
            snapToTargetExistingView();
        }
    }

    public abstract int[] calculateDistanceToFinalSnap(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar, View view);

    public int[] calculateScrollDistance(int i13, int i14) {
        this.mGravityScroller.fling(0, 0, i13, i14, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.mGravityScroller.getFinalX(), this.mGravityScroller.getFinalY()};
    }

    protected RecyclerView.pmvmpeiblj createScroller(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar) {
        return createSnapScroller(rgvfuqvkyqVar);
    }

    @Deprecated
    protected rgvfuqvkyq createSnapScroller(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar) {
        if (rgvfuqvkyqVar instanceof RecyclerView.pmvmpeiblj.zoijcleaow) {
            return new zoijcleaow(this.mRecyclerView.getContext());
        }
        return null;
    }

    public abstract View findSnapView(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar);

    public abstract int findTargetSnapPosition(RecyclerView.rgvfuqvkyq rgvfuqvkyqVar, int i13, int i14);

    @Override // androidx.recyclerview.widget.RecyclerView.kcexrzcfyt
    public boolean onFling(int i13, int i14) {
        RecyclerView.rgvfuqvkyq layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager == null || this.mRecyclerView.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.mRecyclerView.getMinFlingVelocity();
        return (Math.abs(i14) > minFlingVelocity || Math.abs(i13) > minFlingVelocity) && ppxfxbqfkf(layoutManager, i13, i14);
    }

    void snapToTargetExistingView() {
        RecyclerView.rgvfuqvkyq layoutManager;
        View viewFindSnapView;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewFindSnapView = findSnapView(layoutManager)) == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, viewFindSnapView);
        int i13 = iArrCalculateDistanceToFinalSnap[0];
        if (i13 == 0 && iArrCalculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.mRecyclerView.F(i13, iArrCalculateDistanceToFinalSnap[1]);
    }
}
