package modern.payments.ecomAndroid.util.snaphelper;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.rgvfuqvkyq;
import androidx.recyclerview.widget.vdvldrhtss;
import androidx.recyclerview.widget.yggfygwlhe;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import t1.ojitshcjhn;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 n2\u00020\u0001:\u0002noB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\nJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J1\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b'\u0010&J\u0019\u0010*\u001a\u00020 2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J\u0019\u0010,\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010,\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b,\u0010.J\u001f\u00100\u001a\u00020/2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b0\u00101J\u001f\u00104\u001a\u00020/2\u0006\u00102\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u0002H\u0016¢\u0006\u0004\b4\u00105J\u0019\u00107\u001a\u0004\u0018\u0001062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020 2\b\u00109\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b:\u0010;J\u001d\u0010=\u001a\u00020 2\u0006\u0010<\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b=\u0010>J\u001d\u0010?\u001a\u00020 2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b?\u0010@J\u0015\u0010A\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\bA\u0010BJ\u0015\u0010C\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\bC\u0010BJ\r\u0010D\u001a\u00020\u0002¢\u0006\u0004\bD\u0010EJ\u0015\u0010=\u001a\u00020 2\u0006\u0010<\u001a\u00020\u0002¢\u0006\u0004\b=\u0010\"J\r\u0010F\u001a\u00020\u0002¢\u0006\u0004\bF\u0010EJ\u0017\u0010H\u001a\u00020 2\b\b\u0001\u0010G\u001a\u00020\u0002¢\u0006\u0004\bH\u0010\"J\r\u0010J\u001a\u00020I¢\u0006\u0004\bJ\u0010KJ\u0015\u0010M\u001a\u00020 2\u0006\u0010L\u001a\u00020I¢\u0006\u0004\bM\u0010NR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010OR\u0016\u0010P\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\"\u0010R\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010Q\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0016\u0010W\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010OR\u0016\u0010X\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010QR\"\u0010Y\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Q\u001a\u0004\bZ\u0010T\"\u0004\b[\u0010VR\"\u0010\\\u001a\u00020I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010K\"\u0004\b_\u0010NR\u0016\u0010`\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010OR\u0016\u0010a\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010]R\u0018\u0010b\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010d\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010cR\u0018\u00109\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010eR\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010k\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010ER\u0011\u0010m\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bl\u0010E¨\u0006p"}, d2 = {"Lmodern/payments/ecomAndroid/util/snaphelper/GravitySnapHelper;", "Landroidx/recyclerview/widget/vdvldrhtss;", "", "gravity", "", "enableSnapLastItem", "Lmodern/payments/ecomAndroid/util/snaphelper/GravitySnapHelper$SnapListener;", "snapListener", "<init>", "(IZLmodern/payments/ecomAndroid/util/snaphelper/GravitySnapHelper$SnapListener;)V", "(ILmodern/payments/ecomAndroid/util/snaphelper/GravitySnapHelper$SnapListener;)V", "position", "smooth", "scrollTo", "(IZ)Z", "Landroid/view/View;", "targetView", "Landroidx/recyclerview/widget/yggfygwlhe;", "helper", "getDistanceToStart", "(Landroid/view/View;Landroidx/recyclerview/widget/yggfygwlhe;)I", "getDistanceToEnd", "Landroidx/recyclerview/widget/RecyclerView$rgvfuqvkyq;", "layoutManager", "checkEdgeOfList", "findView", "(Landroidx/recyclerview/widget/RecyclerView$rgvfuqvkyq;Landroidx/recyclerview/widget/yggfygwlhe;IZ)Landroid/view/View;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "lm", "isAtEdgeOfList", "(Landroidx/recyclerview/widget/LinearLayoutManager;)Z", "newState", "Lgg/wwaezpbzkn;", "onScrollStateChanged", "(I)V", "dispatchSnapChangeWhenPositionIsUnknown", "()V", "getVerticalHelper", "(Landroidx/recyclerview/widget/RecyclerView$rgvfuqvkyq;)Landroidx/recyclerview/widget/yggfygwlhe;", "getHorizontalHelper", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "attachToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "findSnapView", "(Landroidx/recyclerview/widget/RecyclerView$rgvfuqvkyq;)Landroid/view/View;", "(Landroidx/recyclerview/widget/RecyclerView$rgvfuqvkyq;Z)Landroid/view/View;", "", "calculateDistanceToFinalSnap", "(Landroidx/recyclerview/widget/RecyclerView$rgvfuqvkyq;Landroid/view/View;)[I", "velocityX", "velocityY", "calculateScrollDistance", "(II)[I", "Landroidx/recyclerview/widget/RecyclerView$pmvmpeiblj;", "createScroller", "(Landroidx/recyclerview/widget/RecyclerView$rgvfuqvkyq;)Landroidx/recyclerview/widget/RecyclerView$pmvmpeiblj;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setSnapListener", "(Lmodern/payments/ecomAndroid/util/snaphelper/GravitySnapHelper$SnapListener;)V", "newGravity", "setGravity", "(IZ)V", "updateSnap", "(ZZ)V", "scrollToPosition", "(I)Z", "smoothScrollToPosition", "getGravity", "()I", "getMaxFlingDistance", "distance", "setMaxFlingDistance", "", "getMaxFlingSizeFraction", "()F", "fraction", "setMaxFlingSizeFraction", "(F)V", "I", "isRtl", "Z", "snapLastItem", "getSnapLastItem", "()Z", "setSnapLastItem", "(Z)V", "nextSnapPosition", "isScrolling", "snapToPadding", "getSnapToPadding", "setSnapToPadding", "scrollMsPerInch", "F", "getScrollMsPerInch", "setScrollMsPerInch", "maxFlingDistance", "maxFlingSizeFraction", "verticalHelper", "Landroidx/recyclerview/widget/yggfygwlhe;", "horizontalHelper", "Lmodern/payments/ecomAndroid/util/snaphelper/GravitySnapHelper$SnapListener;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView$yggfygwlhe;", "scrollListener", "Landroidx/recyclerview/widget/RecyclerView$yggfygwlhe;", "getFlingDistance", "flingDistance", "getCurrentSnappedPosition", "currentSnappedPosition", "Companion", "SnapListener", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GravitySnapHelper extends vdvldrhtss {
    public static final int FLING_DISTANCE_DISABLE = -1;
    public static final float FLING_SIZE_FRACTION_DISABLE = -1.0f;
    private int gravity;
    private yggfygwlhe horizontalHelper;
    private boolean isRtl;
    private boolean isScrolling;
    private SnapListener listener;
    private int maxFlingDistance;
    private float maxFlingSizeFraction;
    private int nextSnapPosition;
    private RecyclerView recyclerView;
    private final RecyclerView.yggfygwlhe scrollListener;
    private float scrollMsPerInch;
    private boolean snapLastItem;
    private boolean snapToPadding;
    private yggfygwlhe verticalHelper;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmodern/payments/ecomAndroid/util/snaphelper/GravitySnapHelper$SnapListener;", "", "", "position", "Lgg/wwaezpbzkn;", "onSnap", "(I)V", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface SnapListener {
        void onSnap(int position);
    }

    public GravitySnapHelper(int i13) {
        this(i13, false, null, 6, null);
    }

    private final void dispatchSnapChangeWhenPositionIsUnknown() {
        View viewFindSnapView;
        RecyclerView recyclerView = this.recyclerView;
        zdlpuopuiu.lqeggnwhkg(recyclerView);
        RecyclerView.rgvfuqvkyq layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || (viewFindSnapView = findSnapView(layoutManager, false)) == null) {
            return;
        }
        RecyclerView recyclerView2 = this.recyclerView;
        zdlpuopuiu.lqeggnwhkg(recyclerView2);
        int iYfnezrywwk = recyclerView2.yfnezrywwk(viewFindSnapView);
        if (iYfnezrywwk != -1) {
            SnapListener snapListener = this.listener;
            zdlpuopuiu.lqeggnwhkg(snapListener);
            snapListener.onSnap(iYfnezrywwk);
        }
    }

    private final View findView(RecyclerView.rgvfuqvkyq layoutManager, yggfygwlhe helper, int gravity, boolean checkEdgeOfList) {
        int iAbs;
        View view = null;
        if (layoutManager.vipkmwdibw() != 0 && (layoutManager instanceof LinearLayoutManager)) {
            if (checkEdgeOfList && isAtEdgeOfList((LinearLayoutManager) layoutManager) && !this.snapLastItem) {
                return null;
            }
            int iAgtfadlqog = layoutManager.okpsazkaxt() ? helper.agtfadlqog() + (helper.ojitshcjhn() / 2) : helper.nufgyqmvbu() / 2;
            boolean z13 = true;
            boolean z14 = (gravity == 8388611 && !this.isRtl) || (gravity == 8388613 && this.isRtl);
            if ((gravity != 8388611 || !this.isRtl) && (gravity != 8388613 || this.isRtl)) {
                z13 = false;
            }
            int iVipkmwdibw = ((LinearLayoutManager) layoutManager).vipkmwdibw();
            int i13 = Integer.MAX_VALUE;
            for (int i14 = 0; i14 < iVipkmwdibw; i14++) {
                View viewRibwqtqdhb = layoutManager.ribwqtqdhb(i14);
                if (z14) {
                    iAbs = !this.snapToPadding ? Math.abs(helper.lqeggnwhkg(viewRibwqtqdhb)) : Math.abs(helper.agtfadlqog() - helper.lqeggnwhkg(viewRibwqtqdhb));
                } else if (z13) {
                    iAbs = !this.snapToPadding ? Math.abs(helper.wkgbmnqykc(viewRibwqtqdhb) - helper.nufgyqmvbu()) : Math.abs(helper.dxjokdxxww() - helper.wkgbmnqykc(viewRibwqtqdhb));
                } else {
                    iAbs = Math.abs((helper.lqeggnwhkg(viewRibwqtqdhb) + (helper.eablkybsjg(viewRibwqtqdhb) / 2)) - iAgtfadlqog);
                }
                if (iAbs < i13) {
                    view = viewRibwqtqdhb;
                    i13 = iAbs;
                }
            }
        }
        return view;
    }

    private final int getDistanceToEnd(View targetView, yggfygwlhe helper) {
        int iWkgbmnqykc;
        int iDxjokdxxww;
        if (this.snapToPadding) {
            iWkgbmnqykc = helper.wkgbmnqykc(targetView);
            iDxjokdxxww = helper.dxjokdxxww();
        } else {
            int iWkgbmnqykc2 = helper.wkgbmnqykc(targetView);
            if (iWkgbmnqykc2 < helper.nufgyqmvbu() - ((helper.nufgyqmvbu() - helper.dxjokdxxww()) / 2)) {
                return iWkgbmnqykc2 - helper.dxjokdxxww();
            }
            iWkgbmnqykc = helper.wkgbmnqykc(targetView);
            iDxjokdxxww = helper.nufgyqmvbu();
        }
        return iWkgbmnqykc - iDxjokdxxww;
    }

    private final int getDistanceToStart(View targetView, yggfygwlhe helper) {
        int iLqeggnwhkg;
        int iAgtfadlqog;
        if (this.snapToPadding) {
            iLqeggnwhkg = helper.lqeggnwhkg(targetView);
            iAgtfadlqog = helper.agtfadlqog();
        } else {
            iLqeggnwhkg = helper.lqeggnwhkg(targetView);
            if (iLqeggnwhkg < helper.agtfadlqog() / 2) {
                return iLqeggnwhkg;
            }
            iAgtfadlqog = helper.agtfadlqog();
        }
        return iLqeggnwhkg - iAgtfadlqog;
    }

    private final int getFlingDistance() {
        if (this.maxFlingSizeFraction == -1.0f) {
            int i13 = this.maxFlingDistance;
            if (i13 != -1) {
                return i13;
            }
            return Integer.MAX_VALUE;
        }
        if (this.verticalHelper != null) {
            RecyclerView recyclerView = this.recyclerView;
            zdlpuopuiu.lqeggnwhkg(recyclerView);
            return (int) (recyclerView.getHeight() * this.maxFlingSizeFraction);
        }
        if (this.horizontalHelper == null) {
            return Integer.MAX_VALUE;
        }
        RecyclerView recyclerView2 = this.recyclerView;
        zdlpuopuiu.lqeggnwhkg(recyclerView2);
        return (int) (recyclerView2.getWidth() * this.maxFlingSizeFraction);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000d  */
    private final yggfygwlhe getHorizontalHelper(RecyclerView.rgvfuqvkyq layoutManager) {
        yggfygwlhe yggfygwlheVar = this.horizontalHelper;
        if (yggfygwlheVar != null) {
            zdlpuopuiu.lqeggnwhkg(yggfygwlheVar);
            if (yggfygwlheVar.gtknphoqwx() != layoutManager) {
                this.horizontalHelper = yggfygwlhe.iobyxmoadg(layoutManager);
            }
        } else {
            this.horizontalHelper = yggfygwlhe.iobyxmoadg(layoutManager);
        }
        return this.horizontalHelper;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000d  */
    private final yggfygwlhe getVerticalHelper(RecyclerView.rgvfuqvkyq layoutManager) {
        yggfygwlhe yggfygwlheVar = this.verticalHelper;
        if (yggfygwlheVar != null) {
            zdlpuopuiu.lqeggnwhkg(yggfygwlheVar);
            if (yggfygwlheVar.gtknphoqwx() != layoutManager) {
                this.verticalHelper = yggfygwlhe.ppxfxbqfkf(layoutManager);
            }
        } else {
            this.verticalHelper = yggfygwlhe.ppxfxbqfkf(layoutManager);
        }
        return this.verticalHelper;
    }

    private final boolean isAtEdgeOfList(LinearLayoutManager lm2) {
        if ((!lm2.H0() && this.gravity == 8388611) || ((lm2.H0() && this.gravity == 8388613) || ((!lm2.H0() && this.gravity == 48) || (lm2.H0() && this.gravity == 80)))) {
            return lm2.t0() == lm2.iobyxmoadg() - 1;
        }
        if (this.gravity == 17) {
            if (lm2.o0() != 0 && lm2.t0() != lm2.iobyxmoadg() - 1) {
                return false;
            }
        } else if (lm2.o0() != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onScrollStateChanged(int newState) {
        SnapListener snapListener;
        if (newState == 0 && (snapListener = this.listener) != null && this.isScrolling) {
            if (this.nextSnapPosition != -1) {
                zdlpuopuiu.lqeggnwhkg(snapListener);
                snapListener.onSnap(this.nextSnapPosition);
            } else {
                dispatchSnapChangeWhenPositionIsUnknown();
            }
        }
        this.isScrolling = newState != 0;
    }

    private final boolean scrollTo(int position, boolean smooth) {
        RecyclerView recyclerView = this.recyclerView;
        zdlpuopuiu.lqeggnwhkg(recyclerView);
        if (recyclerView.getLayoutManager() != null) {
            if (smooth) {
                RecyclerView recyclerView2 = this.recyclerView;
                zdlpuopuiu.lqeggnwhkg(recyclerView2);
                RecyclerView.rgvfuqvkyq layoutManager = recyclerView2.getLayoutManager();
                zdlpuopuiu.lqeggnwhkg(layoutManager);
                RecyclerView.pmvmpeiblj pmvmpeibljVarCreateScroller = createScroller(layoutManager);
                if (pmvmpeibljVarCreateScroller != null) {
                    pmvmpeibljVarCreateScroller.setTargetPosition(position);
                    RecyclerView recyclerView3 = this.recyclerView;
                    zdlpuopuiu.lqeggnwhkg(recyclerView3);
                    RecyclerView.rgvfuqvkyq layoutManager2 = recyclerView3.getLayoutManager();
                    zdlpuopuiu.lqeggnwhkg(layoutManager2);
                    layoutManager2.c0(pmvmpeibljVarCreateScroller);
                    return true;
                }
            } else {
                RecyclerView recyclerView4 = this.recyclerView;
                zdlpuopuiu.lqeggnwhkg(recyclerView4);
                RecyclerView.iozdgvuglv iozdgvuglvVarJztzpxfvev = recyclerView4.jztzpxfvev(position);
                if (iozdgvuglvVarJztzpxfvev != null) {
                    RecyclerView recyclerView5 = this.recyclerView;
                    zdlpuopuiu.lqeggnwhkg(recyclerView5);
                    RecyclerView.rgvfuqvkyq layoutManager3 = recyclerView5.getLayoutManager();
                    zdlpuopuiu.lqeggnwhkg(layoutManager3);
                    View itemView = iozdgvuglvVarJztzpxfvev.itemView;
                    zdlpuopuiu.dxjokdxxww(itemView, "itemView");
                    int[] iArrCalculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager3, itemView);
                    RecyclerView recyclerView6 = this.recyclerView;
                    zdlpuopuiu.lqeggnwhkg(recyclerView6);
                    recyclerView6.scrollBy(iArrCalculateDistanceToFinalSnap[0], iArrCalculateDistanceToFinalSnap[1]);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.lereixgezr
    public void attachToRecyclerView(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            zdlpuopuiu.lqeggnwhkg(recyclerView2);
            recyclerView2.r(this.scrollListener);
        }
        if (recyclerView != null) {
            recyclerView.setOnFlingListener(null);
            int i13 = this.gravity;
            if (i13 == 8388611 || i13 == 8388613) {
                this.isRtl = ojitshcjhn.iobyxmoadg(Locale.getDefault()) == 1;
            }
            recyclerView.agtfadlqog(this.scrollListener);
            this.recyclerView = recyclerView;
        } else {
            this.recyclerView = null;
        }
        super.attachToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.vdvldrhtss, androidx.recyclerview.widget.lereixgezr
    public int[] calculateDistanceToFinalSnap(RecyclerView.rgvfuqvkyq layoutManager, View targetView) {
        zdlpuopuiu.btonecajqb(layoutManager, "layoutManager");
        zdlpuopuiu.btonecajqb(targetView, "targetView");
        if (this.gravity == 17) {
            int[] iArrCalculateDistanceToFinalSnap = super.calculateDistanceToFinalSnap(layoutManager, targetView);
            zdlpuopuiu.lqeggnwhkg(iArrCalculateDistanceToFinalSnap);
            return iArrCalculateDistanceToFinalSnap;
        }
        int[] iArr = new int[2];
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return iArr;
        }
        if (layoutManager.pmvmpeiblj()) {
            boolean z13 = this.isRtl;
            if (!(z13 && this.gravity == 8388613) && (z13 || this.gravity != 8388611)) {
                yggfygwlhe horizontalHelper = getHorizontalHelper(layoutManager);
                zdlpuopuiu.lqeggnwhkg(horizontalHelper);
                iArr[0] = getDistanceToEnd(targetView, horizontalHelper);
            } else {
                yggfygwlhe horizontalHelper2 = getHorizontalHelper(layoutManager);
                zdlpuopuiu.lqeggnwhkg(horizontalHelper2);
                iArr[0] = getDistanceToStart(targetView, horizontalHelper2);
            }
        } else if (layoutManager.zynmafqrjb()) {
            if (this.gravity == 48) {
                yggfygwlhe verticalHelper = getVerticalHelper(layoutManager);
                zdlpuopuiu.lqeggnwhkg(verticalHelper);
                iArr[1] = getDistanceToStart(targetView, verticalHelper);
            } else {
                yggfygwlhe verticalHelper2 = getVerticalHelper(layoutManager);
                zdlpuopuiu.lqeggnwhkg(verticalHelper2);
                iArr[1] = getDistanceToEnd(targetView, verticalHelper2);
            }
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.lereixgezr
    public int[] calculateScrollDistance(int velocityX, int velocityY) {
        if (this.recyclerView == null || ((this.verticalHelper == null && this.horizontalHelper == null) || (this.maxFlingDistance == -1 && this.maxFlingSizeFraction == -1.0f))) {
            int[] iArrCalculateScrollDistance = super.calculateScrollDistance(velocityX, velocityY);
            zdlpuopuiu.dxjokdxxww(iArrCalculateScrollDistance, "calculateScrollDistance(...)");
            return iArrCalculateScrollDistance;
        }
        RecyclerView recyclerView = this.recyclerView;
        zdlpuopuiu.lqeggnwhkg(recyclerView);
        Scroller scroller = new Scroller(recyclerView.getContext(), new DecelerateInterpolator());
        int flingDistance = getFlingDistance();
        int i13 = -flingDistance;
        scroller.fling(0, 0, velocityX, velocityY, i13, flingDistance, i13, flingDistance);
        return new int[]{scroller.getFinalX(), scroller.getFinalY()};
    }

    @Override // androidx.recyclerview.widget.lereixgezr
    public RecyclerView.pmvmpeiblj createScroller(RecyclerView.rgvfuqvkyq layoutManager) {
        RecyclerView recyclerView;
        zdlpuopuiu.btonecajqb(layoutManager, "layoutManager");
        if (!(layoutManager instanceof RecyclerView.pmvmpeiblj.zoijcleaow) || (recyclerView = this.recyclerView) == null) {
            return null;
        }
        zdlpuopuiu.lqeggnwhkg(recyclerView);
        return new rgvfuqvkyq(recyclerView.getContext()) { // from class: modern.payments.ecomAndroid.util.snaphelper.GravitySnapHelper.createScroller.1
            @Override // androidx.recyclerview.widget.rgvfuqvkyq
            protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                zdlpuopuiu.btonecajqb(displayMetrics, "displayMetrics");
                return GravitySnapHelper.this.getScrollMsPerInch() / displayMetrics.densityDpi;
            }

            @Override // androidx.recyclerview.widget.rgvfuqvkyq, androidx.recyclerview.widget.RecyclerView.pmvmpeiblj
            protected void onTargetFound(View targetView, RecyclerView.zynmafqrjb state, RecyclerView.pmvmpeiblj.iobyxmoadg action) {
                zdlpuopuiu.btonecajqb(targetView, "targetView");
                zdlpuopuiu.btonecajqb(state, "state");
                zdlpuopuiu.btonecajqb(action, "action");
                if (GravitySnapHelper.this.recyclerView != null) {
                    RecyclerView recyclerView2 = GravitySnapHelper.this.recyclerView;
                    zdlpuopuiu.lqeggnwhkg(recyclerView2);
                    if (recyclerView2.getLayoutManager() == null) {
                        return;
                    }
                    GravitySnapHelper gravitySnapHelper = GravitySnapHelper.this;
                    RecyclerView recyclerView3 = gravitySnapHelper.recyclerView;
                    zdlpuopuiu.lqeggnwhkg(recyclerView3);
                    RecyclerView.rgvfuqvkyq layoutManager2 = recyclerView3.getLayoutManager();
                    zdlpuopuiu.lqeggnwhkg(layoutManager2);
                    int[] iArrCalculateDistanceToFinalSnap = gravitySnapHelper.calculateDistanceToFinalSnap(layoutManager2, targetView);
                    int i13 = iArrCalculateDistanceToFinalSnap[0];
                    int i14 = iArrCalculateDistanceToFinalSnap[1];
                    int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i13), Math.abs(i14)));
                    if (iCalculateTimeForDeceleration > 0) {
                        action.wkgbmnqykc(i13, i14, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
                    }
                }
            }
        };
    }

    @Override // androidx.recyclerview.widget.vdvldrhtss, androidx.recyclerview.widget.lereixgezr
    public View findSnapView(RecyclerView.rgvfuqvkyq lm2) {
        zdlpuopuiu.btonecajqb(lm2, "lm");
        return findSnapView(lm2, true);
    }

    public final int getCurrentSnappedPosition() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null) {
            return -1;
        }
        zdlpuopuiu.lqeggnwhkg(recyclerView);
        if (recyclerView.getLayoutManager() == null) {
            return -1;
        }
        RecyclerView recyclerView2 = this.recyclerView;
        zdlpuopuiu.lqeggnwhkg(recyclerView2);
        RecyclerView.rgvfuqvkyq layoutManager = recyclerView2.getLayoutManager();
        zdlpuopuiu.lqeggnwhkg(layoutManager);
        View viewFindSnapView = findSnapView(layoutManager);
        if (viewFindSnapView == null) {
            return -1;
        }
        RecyclerView recyclerView3 = this.recyclerView;
        zdlpuopuiu.lqeggnwhkg(recyclerView3);
        return recyclerView3.yfnezrywwk(viewFindSnapView);
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final int getMaxFlingDistance() {
        return this.maxFlingDistance;
    }

    public final float getMaxFlingSizeFraction() {
        return this.maxFlingSizeFraction;
    }

    public final float getScrollMsPerInch() {
        return this.scrollMsPerInch;
    }

    public final boolean getSnapLastItem() {
        return this.snapLastItem;
    }

    public final boolean getSnapToPadding() {
        return this.snapToPadding;
    }

    public final boolean scrollToPosition(int position) {
        if (position == -1) {
            return false;
        }
        return scrollTo(position, false);
    }

    public final void setGravity(int newGravity, boolean smooth) {
        if (this.gravity != newGravity) {
            this.gravity = newGravity;
            updateSnap(smooth, false);
        }
    }

    public final void setMaxFlingDistance(int distance) {
        this.maxFlingDistance = distance;
        this.maxFlingSizeFraction = -1.0f;
    }

    public final void setMaxFlingSizeFraction(float fraction) {
        this.maxFlingDistance = -1;
        this.maxFlingSizeFraction = fraction;
    }

    public final void setScrollMsPerInch(float f13) {
        this.scrollMsPerInch = f13;
    }

    public final void setSnapLastItem(boolean z13) {
        this.snapLastItem = z13;
    }

    public final void setSnapListener(SnapListener listener) {
        this.listener = listener;
    }

    public final void setSnapToPadding(boolean z13) {
        this.snapToPadding = z13;
    }

    public final boolean smoothScrollToPosition(int position) {
        if (position == -1) {
            return false;
        }
        return scrollTo(position, true);
    }

    public final void updateSnap(boolean smooth, boolean checkEdgeOfList) {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            zdlpuopuiu.lqeggnwhkg(recyclerView);
            if (recyclerView.getLayoutManager() == null) {
                return;
            }
            RecyclerView recyclerView2 = this.recyclerView;
            zdlpuopuiu.lqeggnwhkg(recyclerView2);
            RecyclerView.rgvfuqvkyq layoutManager = recyclerView2.getLayoutManager();
            zdlpuopuiu.lqeggnwhkg(layoutManager);
            View viewFindSnapView = findSnapView(layoutManager, checkEdgeOfList);
            if (viewFindSnapView != null) {
                int[] iArrCalculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, viewFindSnapView);
                if (smooth) {
                    RecyclerView recyclerView3 = this.recyclerView;
                    zdlpuopuiu.lqeggnwhkg(recyclerView3);
                    recyclerView3.F(iArrCalculateDistanceToFinalSnap[0], iArrCalculateDistanceToFinalSnap[1]);
                } else {
                    RecyclerView recyclerView4 = this.recyclerView;
                    zdlpuopuiu.lqeggnwhkg(recyclerView4);
                    recyclerView4.scrollBy(iArrCalculateDistanceToFinalSnap[0], iArrCalculateDistanceToFinalSnap[1]);
                }
            }
        }
    }

    public GravitySnapHelper(int i13, boolean z13) {
        this(i13, z13, null, 4, null);
    }

    public final View findSnapView(RecyclerView.rgvfuqvkyq lm2, boolean checkEdgeOfList) {
        View viewFindView;
        zdlpuopuiu.btonecajqb(lm2, "lm");
        int i13 = this.gravity;
        if (i13 != 17) {
            if (i13 == 48) {
                yggfygwlhe verticalHelper = getVerticalHelper(lm2);
                zdlpuopuiu.lqeggnwhkg(verticalHelper);
                viewFindView = findView(lm2, verticalHelper, 8388611, checkEdgeOfList);
            } else if (i13 == 80) {
                yggfygwlhe verticalHelper2 = getVerticalHelper(lm2);
                zdlpuopuiu.lqeggnwhkg(verticalHelper2);
                viewFindView = findView(lm2, verticalHelper2, 8388613, checkEdgeOfList);
            } else if (i13 == 8388611) {
                yggfygwlhe horizontalHelper = getHorizontalHelper(lm2);
                zdlpuopuiu.lqeggnwhkg(horizontalHelper);
                viewFindView = findView(lm2, horizontalHelper, 8388611, checkEdgeOfList);
            } else if (i13 != 8388613) {
                viewFindView = null;
            } else {
                yggfygwlhe horizontalHelper2 = getHorizontalHelper(lm2);
                zdlpuopuiu.lqeggnwhkg(horizontalHelper2);
                viewFindView = findView(lm2, horizontalHelper2, 8388613, checkEdgeOfList);
            }
        } else if (lm2.pmvmpeiblj()) {
            yggfygwlhe horizontalHelper3 = getHorizontalHelper(lm2);
            zdlpuopuiu.lqeggnwhkg(horizontalHelper3);
            viewFindView = findView(lm2, horizontalHelper3, 17, checkEdgeOfList);
        } else {
            yggfygwlhe verticalHelper3 = getVerticalHelper(lm2);
            zdlpuopuiu.lqeggnwhkg(verticalHelper3);
            viewFindView = findView(lm2, verticalHelper3, 17, checkEdgeOfList);
        }
        if (viewFindView != null) {
            RecyclerView recyclerView = this.recyclerView;
            zdlpuopuiu.lqeggnwhkg(recyclerView);
            this.nextSnapPosition = recyclerView.yfnezrywwk(viewFindView);
        } else {
            this.nextSnapPosition = -1;
        }
        return viewFindView;
    }

    public /* synthetic */ GravitySnapHelper(int i13, boolean z13, SnapListener snapListener, int i14, gtknphoqwx gtknphoqwxVar) {
        this(i13, (i14 & 2) != 0 ? false : z13, (i14 & 4) != 0 ? null : snapListener);
    }

    public GravitySnapHelper(int i13, boolean z13, SnapListener snapListener) {
        this.scrollMsPerInch = 100.0f;
        this.maxFlingDistance = -1;
        this.maxFlingSizeFraction = -1.0f;
        this.scrollListener = new RecyclerView.yggfygwlhe() { // from class: modern.payments.ecomAndroid.util.snaphelper.GravitySnapHelper$scrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.yggfygwlhe
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                zdlpuopuiu.btonecajqb(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, newState);
                this.this$0.onScrollStateChanged(newState);
            }
        };
        if (i13 != 8388611 && i13 != 8388613 && i13 != 80 && i13 != 48 && i13 != 17) {
            throw new IllegalArgumentException("Invalid gravity value. Use START | END | BOTTOM | TOP | CENTER constants");
        }
        this.snapLastItem = z13;
        this.gravity = i13;
        this.listener = snapListener;
    }

    public final void setGravity(int newGravity) {
        setGravity(newGravity, true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GravitySnapHelper(int i13, SnapListener snapListener) {
        this(i13, false, snapListener);
        zdlpuopuiu.btonecajqb(snapListener, "snapListener");
    }
}
