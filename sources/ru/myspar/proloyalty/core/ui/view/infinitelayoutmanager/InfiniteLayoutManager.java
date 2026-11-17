package ru.myspar.proloyalty.core.ui.view.infinitelayoutmanager;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.rgvfuqvkyq;
import androidx.recyclerview.widget.yggfygwlhe;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.vdvldrhtss;
import zg.gtknphoqwx;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b/\b\u0007\u0018\u0000 j2\u00020\u00012\u00020\u0002:\u000f¦\u0001§\u0001¨\u0001©\u0001hª\u0001«\u0001¬\u0001B\u001d\b\u0017\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB)\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\u000fJ+\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\n\u0010\u0013\u001a\u00060\u0011R\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00032\n\u0010\u0013\u001a\u00060\u0011R\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b%\u0010&J\u001b\u0010(\u001a\u00060'R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b(\u0010)J1\u0010,\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010+\u001a\u00020\u0005H\u0002¢\u0006\u0004\b,\u0010-J#\u0010.\u001a\u00060'R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b.\u0010/J\u001b\u00100\u001a\u00020\"2\n\u0010\u0013\u001a\u00060\u0011R\u00020\u0012H\u0002¢\u0006\u0004\b0\u00101J+\u00102\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u00032\n\u0010\u0013\u001a\u00060\u0011R\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b6\u00105J\u0017\u00107\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b7\u0010&J\u0017\u00108\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b8\u0010&J\u000f\u00109\u001a\u00020\u0003H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0003H\u0002¢\u0006\u0004\b;\u0010:J\u000f\u0010<\u001a\u00020\u0003H\u0002¢\u0006\u0004\b<\u0010:J\u001f\u0010@\u001a\u00020?2\u0006\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\u0003H\u0002¢\u0006\u0004\b@\u0010AJ\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00180B2\u0006\u0010\u001d\u001a\u00020\u0003H\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0003H\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0005H\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bJ\u0010KJ\u0011\u0010M\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\bM\u0010NJ\u0019\u0010O\u001a\u00020\"2\b\u0010\u0015\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\bO\u0010PJ#\u0010Q\u001a\u00020\"2\n\u0010\u0013\u001a\u00060\u0011R\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\bQ\u0010RJ\u0019\u0010S\u001a\u00020\"2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u0005H\u0016¢\u0006\u0004\bU\u0010HJ+\u0010W\u001a\u00020\u00032\u0006\u0010V\u001a\u00020\u00032\n\u0010\u0013\u001a\u00060\u0011R\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\bW\u0010\u0017J\u000f\u0010X\u001a\u00020\u0005H\u0016¢\u0006\u0004\bX\u0010HJ+\u0010Z\u001a\u00020\u00032\u0006\u0010Y\u001a\u00020\u00032\n\u0010\u0013\u001a\u00060\u0011R\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\bZ\u0010\u0017J\u0015\u0010\\\u001a\u00020\u00032\u0006\u0010[\u001a\u00020\u0003¢\u0006\u0004\b\\\u0010&J\u0017\u0010]\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b]\u0010^J\u0017\u0010_\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b_\u0010^J\u0017\u0010`\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b`\u0010^J\u0017\u0010a\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\ba\u0010^J\u0017\u0010b\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\bb\u0010^J\u0017\u0010c\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\bc\u0010^J+\u0010f\u001a\u00020\"2\n\u0010\u0013\u001a\u00060\u0011R\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010e\u001a\u00020dH\u0016¢\u0006\u0004\bf\u0010gJ\u0017\u0010h\u001a\u00020?2\u0006\u0010=\u001a\u00020\u0003H\u0016¢\u0006\u0004\bh\u0010iJ\u0019\u0010j\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\bj\u0010kJ3\u0010n\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001d\u001a\u00020\u00032\u001a\u0010m\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00180l¢\u0006\u0004\bn\u0010oJ\u0017\u0010p\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\bp\u0010$J5\u0010r\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00032\u001e\u0010m\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030q¢\u0006\u0004\br\u0010sJ'\u0010v\u001a\u00020\"2\u0006\u0010t\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010u\u001a\u00020\u0003H\u0016¢\u0006\u0004\bv\u0010wR\u0016\u0010z\u001a\u00020x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010yR\u0016\u0010}\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010\u0081\u0001\u001a\u00020~8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R(\u0010\u0085\u0001\u001a\u00020\u00032\u0007\u0010\u0082\u0001\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010|\u001a\u0005\b\u0084\u0001\u0010:R(\u0010\u0088\u0001\u001a\u00020\u00032\u0007\u0010\u0082\u0001\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010|\u001a\u0005\b\u0087\u0001\u0010:RA\u0010\u008f\u0001\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030q8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R-\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0090\u0001\u0010|\u001a\u0005\b\u0091\u0001\u0010:\"\u0005\b\u0092\u0001\u0010$R/\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0005\b\u0095\u0001\u0010H\"\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0016\u0010\u0099\u0001\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010:R\u0016\u0010\u009b\u0001\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010:R\u0016\u0010\u009d\u0001\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010:R\u0016\u0010\u009f\u0001\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010:R\u0013\u0010¡\u0001\u001a\u00020\u00038F¢\u0006\u0007\u001a\u0005\b \u0001\u0010:R\u0013\u0010£\u0001\u001a\u00020\u00038F¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010:R\u0013\u0010¥\u0001\u001a\u00020\u00058F¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010H¨\u0006\u00ad\u0001"}, d2 = {"Lru/myspar/proloyalty/core/ui/view/infinitelayoutmanager/InfiniteLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$rgvfuqvkyq;", "Landroidx/recyclerview/widget/RecyclerView$pmvmpeiblj$zoijcleaow;", "", "orientation", "", "reverseLayout", "<init>", "(IZ)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "delta", "Landroidx/recyclerview/widget/RecyclerView$iwizpuwonk;", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Landroidx/recyclerview/widget/RecyclerView$zynmafqrjb;", "state", "Q0", "(ILandroidx/recyclerview/widget/RecyclerView$iwizpuwonk;Landroidx/recyclerview/widget/RecyclerView$zynmafqrjb;)I", "Landroid/view/View;", "view", "Landroid/graphics/Rect;", "F0", "(Landroid/view/View;)Landroid/graphics/Rect;", "adapterIndex", "movementDir", "u0", "(IILandroidx/recyclerview/widget/RecyclerView$iwizpuwonk;)Landroid/view/View;", "amount", "Lgg/wwaezpbzkn;", "N0", "(I)V", "z0", "(I)I", "Lru/myspar/proloyalty/core/ui/view/infinitelayoutmanager/InfiniteLayoutManager$gxszxtbevo;", "A0", "(I)Lru/myspar/proloyalty/core/ui/view/infinitelayoutmanager/InfiniteLayoutManager$gxszxtbevo;", "index", "updateIndex", "U0", "(IILandroidx/recyclerview/widget/RecyclerView$zynmafqrjb;Z)I", "B0", "(ILandroid/view/View;)Lru/myspar/proloyalty/core/ui/view/infinitelayoutmanager/InfiniteLayoutManager$gxszxtbevo;", "P0", "(Landroidx/recyclerview/widget/RecyclerView$iwizpuwonk;)V", "O0", "(ILandroidx/recyclerview/widget/RecyclerView$iwizpuwonk;Landroidx/recyclerview/widget/RecyclerView$zynmafqrjb;)V", "X0", "(Landroid/view/View;)Z", "W0", "x0", "E0", "q0", "()I", "r0", "p0", "targetPosition", "count", "Landroid/graphics/PointF;", "s0", "(II)Landroid/graphics/PointF;", "", "v0", "(I)Ljava/lang/Iterable;", "Y0", "(I)Z", "lxfrhoxuzk", "()Z", "Landroidx/recyclerview/widget/RecyclerView$vdvldrhtss;", "ntlheqmsrt", "()Landroidx/recyclerview/widget/RecyclerView$vdvldrhtss;", "Landroid/os/Parcelable;", "v", "()Landroid/os/Parcelable;", "u", "(Landroid/os/Parcelable;)V", "p", "(Landroidx/recyclerview/widget/RecyclerView$iwizpuwonk;Landroidx/recyclerview/widget/RecyclerView$zynmafqrjb;)V", "q", "(Landroidx/recyclerview/widget/RecyclerView$zynmafqrjb;)V", "zynmafqrjb", "dy", "R", "pmvmpeiblj", "dx", "P", "adapterDir", "t0", "hcddaimhww", "(Landroidx/recyclerview/widget/RecyclerView$zynmafqrjb;)I", "jpowsppfya", "pkzmftpjix", "wwaezpbzkn", "ylkuphrtab", "lmojexxdyd", "Landroid/view/accessibility/AccessibilityEvent;", "event", "d", "(Landroidx/recyclerview/widget/RecyclerView$iwizpuwonk;Landroidx/recyclerview/widget/RecyclerView$zynmafqrjb;Landroid/view/accessibility/AccessibilityEvent;)V", "zoijcleaow", "(I)Landroid/graphics/PointF;", "mbcevpiqjq", "(I)Landroid/view/View;", "Lkotlin/Function2;", "strategy", "w0", "(ILtg/rgvfuqvkyq;)Landroid/view/View;", "Q", "Lkotlin/Function3;", "R0", "(ILtg/vdvldrhtss;)V", "recyclerView", "position", "b0", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$zynmafqrjb;I)V", "Lru/myspar/proloyalty/core/ui/view/infinitelayoutmanager/InfiniteLayoutManager$LayoutRequest;", "Lru/myspar/proloyalty/core/ui/view/infinitelayoutmanager/InfiniteLayoutManager$LayoutRequest;", "layoutRequest", "hkdspvbjdz", "I", "extraLayoutSpace", "Landroidx/recyclerview/widget/yggfygwlhe;", "cllcsxoeiz", "Landroidx/recyclerview/widget/yggfygwlhe;", "orientationHelper", "value", "dsvhmnatus", "L0", "topLeftIndex", "wypolnanlu", "y0", "bottomRightIndex", "stevsuqkhv", "Ltg/vdvldrhtss;", "getSmoothScrollDirectionDecider", "()Ltg/vdvldrhtss;", "setSmoothScrollDirectionDecider", "(Ltg/vdvldrhtss;)V", "smoothScrollDirectionDecider", "kegysxyocb", "G0", "S0", "tzroggbefp", "Z", "getReverseLayout", "T0", "(Z)V", "I0", "paddingLeftClip", "J0", "paddingRightClip", "K0", "paddingTopClip", "H0", "paddingBottomClip", "D0", "layoutWidth", "C0", "layoutHeight", "M0", "isLayoutRTL", "gxszxtbevo", "ppxfxbqfkf", "eablkybsjg", "wkgbmnqykc", "lqeggnwhkg", "LayoutRequest", "iobyxmoadg", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InfiniteLayoutManager extends RecyclerView.rgvfuqvkyq implements RecyclerView.pmvmpeiblj.zoijcleaow {

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    public static final int f95357ntlheqmsrt = 8;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name and from kotlin metadata */
    private yggfygwlhe orientationHelper;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name and from kotlin metadata */
    private int topLeftIndex;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name and from kotlin metadata */
    private int extraLayoutSpace;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name and from kotlin metadata */
    private LayoutRequest layoutRequest;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name and from kotlin metadata */
    private int orientation;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name and from kotlin metadata */
    private vdvldrhtss smoothScrollDirectionDecider;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name and from kotlin metadata */
    private boolean reverseLayout;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name and from kotlin metadata */
    private int bottomRightIndex;

    /* synthetic */ class btonecajqb extends kotlin.jvm.internal.vdvldrhtss implements vdvldrhtss {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final btonecajqb f95371zdlpuopuiu = new btonecajqb();

        btonecajqb() {
            super(3, iobyxmoadg.class, "defaultDecider", "defaultDecider(ILru/myspar/proloyalty/core/ui/view/infinitelayoutmanager/InfiniteLayoutManager;I)I", 1);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg(((Number) obj).intValue(), (InfiniteLayoutManager) obj2, ((Number) obj3).intValue());
        }

        public final Integer iobyxmoadg(int i13, InfiniteLayoutManager p13, int i14) {
            zdlpuopuiu.btonecajqb(p13, "p1");
            return Integer.valueOf(iobyxmoadg.zoijcleaow(i13, p13, i14));
        }
    }

    /* synthetic */ class dxjokdxxww extends kotlin.jvm.internal.vdvldrhtss implements vdvldrhtss {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final dxjokdxxww f95372zdlpuopuiu = new dxjokdxxww();

        dxjokdxxww() {
            super(3, iobyxmoadg.class, "defaultDecider", "defaultDecider(ILru/myspar/proloyalty/core/ui/view/infinitelayoutmanager/InfiniteLayoutManager;I)I", 1);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return iobyxmoadg(((Number) obj).intValue(), (InfiniteLayoutManager) obj2, ((Number) obj3).intValue());
        }

        public final Integer iobyxmoadg(int i13, InfiniteLayoutManager p13, int i14) {
            zdlpuopuiu.btonecajqb(p13, "p1");
            return Integer.valueOf(iobyxmoadg.zoijcleaow(i13, p13, i14));
        }
    }

    private final class eablkybsjg extends gxszxtbevo {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ InfiniteLayoutManager f95373ppxfxbqfkf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(InfiniteLayoutManager infiniteLayoutManager, View view) {
            super(infiniteLayoutManager, view);
            zdlpuopuiu.btonecajqb(view, "view");
            this.f95373ppxfxbqfkf = infiniteLayoutManager;
        }

        public int gxszxtbevo() {
            return this.f95373ppxfxbqfkf.xrmfcynszj(eablkybsjg());
        }

        @Override // ru.myspar.proloyalty.core.ui.view.infinitelayoutmanager.InfiniteLayoutManager.gxszxtbevo
        public int iobyxmoadg() {
            return gtknphoqwx.gxszxtbevo(this.f95373ppxfxbqfkf.xrmfcynszj(eablkybsjg()) - (this.f95373ppxfxbqfkf.zfvoamnweg() - this.f95373ppxfxbqfkf.H0()), 0);
        }

        @Override // ru.myspar.proloyalty.core.ui.view.infinitelayoutmanager.InfiniteLayoutManager.gxszxtbevo
        public Rect ppxfxbqfkf(Rect rect, int i13) {
            zdlpuopuiu.btonecajqb(rect, "rect");
            int iK0 = this.f95373ppxfxbqfkf.K0() - i13;
            rect.top = iK0;
            rect.bottom = iK0 + wkgbmnqykc();
            return rect;
        }

        @Override // ru.myspar.proloyalty.core.ui.view.infinitelayoutmanager.InfiniteLayoutManager.gxszxtbevo
        public int wkgbmnqykc() {
            return this.f95373ppxfxbqfkf.czzsidtyhn(eablkybsjg());
        }

        @Override // ru.myspar.proloyalty.core.ui.view.infinitelayoutmanager.InfiniteLayoutManager.gxszxtbevo
        public Rect zoijcleaow(gxszxtbevo item, Rect rect) {
            zdlpuopuiu.btonecajqb(item, "item");
            zdlpuopuiu.btonecajqb(rect, "rect");
            int iGxszxtbevo = gxszxtbevo();
            rect.top = iGxszxtbevo;
            rect.bottom = iGxszxtbevo + item.wkgbmnqykc();
            return rect;
        }
    }

    private abstract class gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final View f95374iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ InfiniteLayoutManager f95375zoijcleaow;

        public gxszxtbevo(InfiniteLayoutManager infiniteLayoutManager, View view) {
            zdlpuopuiu.btonecajqb(view, "view");
            this.f95375zoijcleaow = infiniteLayoutManager;
            this.f95374iobyxmoadg = view;
        }

        protected final View eablkybsjg() {
            return this.f95374iobyxmoadg;
        }

        public abstract int iobyxmoadg();

        public abstract Rect ppxfxbqfkf(Rect rect, int i13);

        public abstract int wkgbmnqykc();

        public abstract Rect zoijcleaow(gxszxtbevo gxszxtbevoVar, Rect rect);
    }

    private final class lqeggnwhkg extends rgvfuqvkyq {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Context f95376iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ InfiniteLayoutManager f95377ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final RecyclerView.zynmafqrjb f95378zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(InfiniteLayoutManager infiniteLayoutManager, Context context, RecyclerView.zynmafqrjb state) {
            super(context);
            zdlpuopuiu.btonecajqb(context, "context");
            zdlpuopuiu.btonecajqb(state, "state");
            this.f95377ppxfxbqfkf = infiniteLayoutManager;
            this.f95376iobyxmoadg = context;
            this.f95378zoijcleaow = state;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.pmvmpeiblj
        public PointF computeScrollVectorForPosition(int i13) {
            RecyclerView.rgvfuqvkyq layoutManager = getLayoutManager();
            if (layoutManager instanceof InfiniteLayoutManager) {
                return ((InfiniteLayoutManager) layoutManager).s0(i13, this.f95378zoijcleaow.zoijcleaow());
            }
            Log.w("InfiniteLayoutManager", "A LoopingSmoothScroller should only be attached to a InfiniteLayoutManager.");
            return null;
        }

        @Override // androidx.recyclerview.widget.rgvfuqvkyq, androidx.recyclerview.widget.RecyclerView.pmvmpeiblj
        protected void onStart() {
            float fCalculateSpeedPerPixel = calculateSpeedPerPixel(this.f95376iobyxmoadg.getResources().getDisplayMetrics());
            RecyclerView.rgvfuqvkyq layoutManager = getLayoutManager();
            zdlpuopuiu.nufgyqmvbu(layoutManager, "null cannot be cast to non-null type ru.myspar.proloyalty.core.ui.view.infinitelayoutmanager.InfiniteLayoutManager");
            ((InfiniteLayoutManager) layoutManager).extraLayoutSpace = (int) (fCalculateSpeedPerPixel * 500);
        }

        @Override // androidx.recyclerview.widget.rgvfuqvkyq, androidx.recyclerview.widget.RecyclerView.pmvmpeiblj
        protected void onStop() {
            RecyclerView.rgvfuqvkyq layoutManager = getLayoutManager();
            zdlpuopuiu.nufgyqmvbu(layoutManager, "null cannot be cast to non-null type ru.myspar.proloyalty.core.ui.view.infinitelayoutmanager.InfiniteLayoutManager");
            ((InfiniteLayoutManager) layoutManager).extraLayoutSpace = 0;
        }
    }

    /* synthetic */ class nufgyqmvbu extends kotlin.jvm.internal.vdvldrhtss implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final nufgyqmvbu f95379zdlpuopuiu = new nufgyqmvbu();

        nufgyqmvbu() {
            super(2, ru.myspar.proloyalty.core.ui.view.infinitelayoutmanager.ppxfxbqfkf.class, "defaultPicker", "defaultPicker(ILru/myspar/proloyalty/core/ui/view/infinitelayoutmanager/InfiniteLayoutManager;)Landroid/view/View;", 1);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return iobyxmoadg(((Number) obj).intValue(), (InfiniteLayoutManager) obj2);
        }

        public final View iobyxmoadg(int i13, InfiniteLayoutManager p13) {
            zdlpuopuiu.btonecajqb(p13, "p1");
            return ru.myspar.proloyalty.core.ui.view.infinitelayoutmanager.ppxfxbqfkf.zoijcleaow(i13, p13);
        }
    }

    private final class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ InfiniteLayoutManager f95380ppxfxbqfkf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(InfiniteLayoutManager infiniteLayoutManager, View view) {
            super(infiniteLayoutManager, view);
            zdlpuopuiu.btonecajqb(view, "view");
            this.f95380ppxfxbqfkf = infiniteLayoutManager;
        }

        public int gxszxtbevo() {
            return this.f95380ppxfxbqfkf.yfnezrywwk(eablkybsjg());
        }

        @Override // ru.myspar.proloyalty.core.ui.view.infinitelayoutmanager.InfiniteLayoutManager.gxszxtbevo
        public int iobyxmoadg() {
            return gtknphoqwx.gxszxtbevo(this.f95380ppxfxbqfkf.yfnezrywwk(eablkybsjg()) - (this.f95380ppxfxbqfkf.iwxlajgraz() - this.f95380ppxfxbqfkf.J0()), 0);
        }

        @Override // ru.myspar.proloyalty.core.ui.view.infinitelayoutmanager.InfiniteLayoutManager.gxszxtbevo
        public Rect ppxfxbqfkf(Rect rect, int i13) {
            zdlpuopuiu.btonecajqb(rect, "rect");
            int iI0 = this.f95380ppxfxbqfkf.I0() - i13;
            rect.left = iI0;
            rect.right = iI0 + wkgbmnqykc();
            return rect;
        }

        @Override // ru.myspar.proloyalty.core.ui.view.infinitelayoutmanager.InfiniteLayoutManager.gxszxtbevo
        public int wkgbmnqykc() {
            return this.f95380ppxfxbqfkf.uwvvkdfqfp(eablkybsjg());
        }

        @Override // ru.myspar.proloyalty.core.ui.view.infinitelayoutmanager.InfiniteLayoutManager.gxszxtbevo
        public Rect zoijcleaow(gxszxtbevo item, Rect rect) {
            zdlpuopuiu.btonecajqb(item, "item");
            zdlpuopuiu.btonecajqb(rect, "rect");
            int iGxszxtbevo = gxszxtbevo();
            rect.left = iGxszxtbevo;
            rect.right = iGxszxtbevo + item.wkgbmnqykc();
            return rect;
        }
    }

    private final class wkgbmnqykc extends gxszxtbevo {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ InfiniteLayoutManager f95381ppxfxbqfkf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(InfiniteLayoutManager infiniteLayoutManager, View view) {
            super(infiniteLayoutManager, view);
            zdlpuopuiu.btonecajqb(view, "view");
            this.f95381ppxfxbqfkf = infiniteLayoutManager;
        }

        public int gxszxtbevo() {
            return this.f95381ppxfxbqfkf.rlfsiqarku(eablkybsjg());
        }

        @Override // ru.myspar.proloyalty.core.ui.view.infinitelayoutmanager.InfiniteLayoutManager.gxszxtbevo
        public int iobyxmoadg() {
            return gtknphoqwx.gxszxtbevo(this.f95381ppxfxbqfkf.I0() - this.f95381ppxfxbqfkf.rlfsiqarku(eablkybsjg()), 0);
        }

        @Override // ru.myspar.proloyalty.core.ui.view.infinitelayoutmanager.InfiniteLayoutManager.gxszxtbevo
        public Rect ppxfxbqfkf(Rect rect, int i13) {
            zdlpuopuiu.btonecajqb(rect, "rect");
            int iIwxlajgraz = (this.f95381ppxfxbqfkf.iwxlajgraz() - this.f95381ppxfxbqfkf.J0()) + i13;
            rect.right = iIwxlajgraz;
            rect.left = iIwxlajgraz - wkgbmnqykc();
            return rect;
        }

        @Override // ru.myspar.proloyalty.core.ui.view.infinitelayoutmanager.InfiniteLayoutManager.gxszxtbevo
        public int wkgbmnqykc() {
            return this.f95381ppxfxbqfkf.uwvvkdfqfp(eablkybsjg());
        }

        @Override // ru.myspar.proloyalty.core.ui.view.infinitelayoutmanager.InfiniteLayoutManager.gxszxtbevo
        public Rect zoijcleaow(gxszxtbevo item, Rect rect) {
            zdlpuopuiu.btonecajqb(item, "item");
            zdlpuopuiu.btonecajqb(rect, "rect");
            int iGxszxtbevo = gxszxtbevo();
            rect.right = iGxszxtbevo;
            rect.left = iGxszxtbevo - item.wkgbmnqykc();
            return rect;
        }
    }

    private final class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ InfiniteLayoutManager f95382ppxfxbqfkf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(InfiniteLayoutManager infiniteLayoutManager, View view) {
            super(infiniteLayoutManager, view);
            zdlpuopuiu.btonecajqb(view, "view");
            this.f95382ppxfxbqfkf = infiniteLayoutManager;
        }

        public int gxszxtbevo() {
            return this.f95382ppxfxbqfkf.ydmasvzmpa(eablkybsjg());
        }

        @Override // ru.myspar.proloyalty.core.ui.view.infinitelayoutmanager.InfiniteLayoutManager.gxszxtbevo
        public int iobyxmoadg() {
            return gtknphoqwx.gxszxtbevo(this.f95382ppxfxbqfkf.K0() - this.f95382ppxfxbqfkf.ydmasvzmpa(eablkybsjg()), 0);
        }

        @Override // ru.myspar.proloyalty.core.ui.view.infinitelayoutmanager.InfiniteLayoutManager.gxszxtbevo
        public Rect ppxfxbqfkf(Rect rect, int i13) {
            zdlpuopuiu.btonecajqb(rect, "rect");
            int iZfvoamnweg = (this.f95382ppxfxbqfkf.zfvoamnweg() - this.f95382ppxfxbqfkf.H0()) + i13;
            rect.bottom = iZfvoamnweg;
            rect.top = iZfvoamnweg - wkgbmnqykc();
            return rect;
        }

        @Override // ru.myspar.proloyalty.core.ui.view.infinitelayoutmanager.InfiniteLayoutManager.gxszxtbevo
        public int wkgbmnqykc() {
            return this.f95382ppxfxbqfkf.czzsidtyhn(eablkybsjg());
        }

        @Override // ru.myspar.proloyalty.core.ui.view.infinitelayoutmanager.InfiniteLayoutManager.gxszxtbevo
        public Rect zoijcleaow(gxszxtbevo item, Rect rect) {
            zdlpuopuiu.btonecajqb(item, "item");
            zdlpuopuiu.btonecajqb(rect, "rect");
            int iGxszxtbevo = gxszxtbevo();
            rect.bottom = iGxszxtbevo;
            rect.top = iGxszxtbevo - item.wkgbmnqykc();
            return rect;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InfiniteLayoutManager() {
        this(0, (boolean) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.gtknphoqwx) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gxszxtbevo A0(int movementDir) {
        View viewRibwqtqdhb = movementDir == -1 ? ribwqtqdhb(0) : ribwqtqdhb(vipkmwdibw() - 1);
        zdlpuopuiu.lqeggnwhkg(viewRibwqtqdhb);
        return B0(movementDir, viewRibwqtqdhb);
    }

    private final gxszxtbevo B0(int movementDir, View view) {
        boolean z13 = this.orientation == 1;
        boolean z14 = movementDir == -1;
        if (z13 && z14) {
            return new zoijcleaow(this, view);
        }
        if (z13 && !z14) {
            return new eablkybsjg(this, view);
        }
        if (!z13 && z14) {
            return new wkgbmnqykc(this, view);
        }
        if (z13 || z14) {
            throw new IllegalStateException("Invalid movement state.");
        }
        return new ppxfxbqfkf(this, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int E0(int movementDir) {
        boolean z13 = this.orientation == 1;
        boolean z14 = movementDir == 1;
        boolean zM0 = M0();
        boolean z15 = this.reverseLayout;
        if (z13 && z14 && !z15) {
            return 1;
        }
        if ((!z13 || !z14 || !z15) && (!z13 || z14 || z15)) {
            if (z13 && !z14 && z15) {
                return 1;
            }
            if (!z13 && z14 && !zM0 && !z15) {
                return 1;
            }
            if ((z13 || !z14 || zM0 || !z15) && (z13 || !z14 || !zM0 || z15)) {
                if (!z13 && z14 && zM0 && z15) {
                    return 1;
                }
                if (z13 || z14 || zM0 || z15) {
                    if (!z13 && !z14 && !zM0 && z15) {
                        return 1;
                    }
                    if (!z13 && !z14 && zM0 && !z15) {
                        return 1;
                    }
                    if (z13 || z14 || !zM0 || !z15) {
                        throw new IllegalStateException("Invalid adapter state.");
                    }
                }
            }
        }
        return -1;
    }

    private final Rect F0(View view) {
        Rect rect = new Rect();
        boolean z13 = this.orientation == 1;
        yggfygwlhe yggfygwlheVar = null;
        if (z13 && M0()) {
            int iIwxlajgraz = iwxlajgraz() - J0();
            rect.right = iIwxlajgraz;
            yggfygwlhe yggfygwlheVar2 = this.orientationHelper;
            if (yggfygwlheVar2 == null) {
                zdlpuopuiu.pmvmpeiblj("orientationHelper");
            } else {
                yggfygwlheVar = yggfygwlheVar2;
            }
            rect.left = iIwxlajgraz - yggfygwlheVar.gxszxtbevo(view);
        } else if (!z13 || M0()) {
            int iK0 = K0();
            rect.top = iK0;
            yggfygwlhe yggfygwlheVar3 = this.orientationHelper;
            if (yggfygwlheVar3 == null) {
                zdlpuopuiu.pmvmpeiblj("orientationHelper");
            } else {
                yggfygwlheVar = yggfygwlheVar3;
            }
            rect.bottom = iK0 + yggfygwlheVar.gxszxtbevo(view);
        } else {
            int iI0 = I0();
            rect.left = iI0;
            yggfygwlhe yggfygwlheVar4 = this.orientationHelper;
            if (yggfygwlheVar4 == null) {
                zdlpuopuiu.pmvmpeiblj("orientationHelper");
            } else {
                yggfygwlheVar = yggfygwlheVar4;
            }
            rect.right = iI0 + yggfygwlheVar.gxszxtbevo(view);
        }
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int H0() {
        Integer numValueOf = Integer.valueOf(getPaddingBottom());
        if (!okpsazkaxt()) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int I0() {
        Integer numValueOf = Integer.valueOf(getPaddingLeft());
        if (!okpsazkaxt()) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int J0() {
        Integer numValueOf = Integer.valueOf(getPaddingRight());
        if (!okpsazkaxt()) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int K0() {
        Integer numValueOf = Integer.valueOf(getPaddingTop());
        if (!okpsazkaxt()) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    private final void N0(int amount) {
        if (this.orientation == 0) {
            fmlbqenlif(amount);
        } else {
            ezmngbhpjk(amount);
        }
    }

    private final void O0(int movementDir, RecyclerView.iwizpuwonk recycler, RecyclerView.zynmafqrjb state) {
        int i13;
        int iZ0 = z0(movementDir);
        ArrayList arrayList = new ArrayList();
        boolean z13 = false;
        zg.nufgyqmvbu nufgyqmvbuVarJyumaefscl = movementDir == -1 ? gtknphoqwx.jyumaefscl(0, vipkmwdibw()) : gtknphoqwx.vdvldrhtss(vipkmwdibw() - 1, 0);
        int iWkgbmnqykc = nufgyqmvbuVarJyumaefscl.wkgbmnqykc();
        int iEablkybsjg = nufgyqmvbuVarJyumaefscl.eablkybsjg();
        int iGxszxtbevo = nufgyqmvbuVarJyumaefscl.gxszxtbevo();
        if ((iGxszxtbevo > 0 && iWkgbmnqykc <= iEablkybsjg) || (iGxszxtbevo < 0 && iEablkybsjg <= iWkgbmnqykc)) {
            i13 = -1;
            while (true) {
                View viewRibwqtqdhb = ribwqtqdhb(iWkgbmnqykc);
                zdlpuopuiu.lqeggnwhkg(viewRibwqtqdhb);
                if (X0(viewRibwqtqdhb)) {
                    if (!z13) {
                        z13 = true;
                    }
                    i13++;
                } else if (z13) {
                    arrayList.add(Integer.valueOf(iWkgbmnqykc));
                }
                if (iWkgbmnqykc == iEablkybsjg) {
                    break;
                } else {
                    iWkgbmnqykc += iGxszxtbevo;
                }
            }
        } else {
            i13 = -1;
        }
        Iterator it = jyumaefscl.c(arrayList).iterator();
        while (it.hasNext()) {
            G(((Number) it.next()).intValue(), recycler);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int iX0 = x0(movementDir * (-1)) * i13;
        int iZoijcleaow = state.zoijcleaow();
        if (movementDir == -1) {
            this.bottomRightIndex = ru.myspar.proloyalty.core.ui.view.infinitelayoutmanager.zoijcleaow.iobyxmoadg(iZ0, iX0, iZoijcleaow);
        } else {
            this.topLeftIndex = ru.myspar.proloyalty.core.ui.view.infinitelayoutmanager.zoijcleaow.iobyxmoadg(iZ0, iX0, iZoijcleaow);
        }
    }

    private final void P0(RecyclerView.iwizpuwonk recycler) {
        int iVipkmwdibw = vipkmwdibw();
        while (true) {
            iVipkmwdibw--;
            if (-1 >= iVipkmwdibw) {
                return;
            }
            View viewRibwqtqdhb = ribwqtqdhb(iVipkmwdibw);
            if (viewRibwqtqdhb != null && !X0(viewRibwqtqdhb)) {
                cllcsxoeiz(viewRibwqtqdhb, recycler);
            }
        }
    }

    private final int Q0(int delta, RecyclerView.iwizpuwonk recycler, RecyclerView.zynmafqrjb state) {
        if (vipkmwdibw() == 0 || delta == 0) {
            return 0;
        }
        int iSignum = Integer.signum(delta);
        P0(recycler);
        int iAbs = Math.abs(delta);
        int iZ0 = z0(iSignum);
        gxszxtbevo gxszxtbevoVarA0 = A0(iSignum);
        int i13 = 0;
        int i14 = iZ0;
        while (i13 < iAbs) {
            int iBtonecajqb = gtknphoqwx.btonecajqb(gxszxtbevoVarA0.iobyxmoadg(), iAbs - i13);
            i13 += iBtonecajqb;
            N0(iBtonecajqb * (-iSignum));
            if (i13 < iAbs) {
                int iV0 = V0(this, i14, iSignum, state, false, 8, null);
                View viewU0 = u0(iV0, iSignum, recycler);
                gxszxtbevo gxszxtbevoVarB0 = B0(iSignum, viewU0);
                Rect rectZoijcleaow = gxszxtbevoVarA0.zoijcleaow(gxszxtbevoVarB0, F0(viewU0));
                mhtqkkgtqm(viewU0, rectZoijcleaow.left, rectZoijcleaow.top, rectZoijcleaow.right, rectZoijcleaow.bottom);
                i14 = iV0;
                gxszxtbevoVarA0 = gxszxtbevoVarB0;
            }
        }
        int iIobyxmoadg = gxszxtbevoVarA0.iobyxmoadg();
        while (iIobyxmoadg < this.extraLayoutSpace) {
            int iU0 = U0(i14, iSignum, state, false);
            View viewU1 = u0(iU0, iSignum, recycler);
            gxszxtbevo gxszxtbevoVarB1 = B0(iSignum, viewU1);
            Rect rectZoijcleaow2 = gxszxtbevoVarA0.zoijcleaow(gxszxtbevoVarB1, F0(viewU1));
            mhtqkkgtqm(viewU1, rectZoijcleaow2.left, rectZoijcleaow2.top, rectZoijcleaow2.right, rectZoijcleaow2.bottom);
            iIobyxmoadg += gxszxtbevoVarB1.wkgbmnqykc();
            i14 = iU0;
            gxszxtbevoVarA0 = gxszxtbevoVarB1;
        }
        O0(iSignum, recycler, state);
        return i13 * iSignum;
    }

    private final int U0(int index, int movementDir, RecyclerView.zynmafqrjb state, boolean updateIndex) {
        int iZoijcleaow;
        int iX0 = x0(movementDir);
        int iZoijcleaow2 = state.zoijcleaow();
        boolean z13 = movementDir == -1;
        boolean z14 = movementDir == 1;
        boolean z15 = iX0 == 1;
        boolean z16 = iX0 == -1;
        if (z13 && z15) {
            iZoijcleaow = ru.myspar.proloyalty.core.ui.view.infinitelayoutmanager.zoijcleaow.ppxfxbqfkf(index, iZoijcleaow2);
            if (updateIndex) {
                this.topLeftIndex = iZoijcleaow;
            }
        } else if (z13 && z16) {
            iZoijcleaow = ru.myspar.proloyalty.core.ui.view.infinitelayoutmanager.zoijcleaow.zoijcleaow(index, iZoijcleaow2);
            if (updateIndex) {
                this.topLeftIndex = iZoijcleaow;
            }
        } else if (z14 && z15) {
            iZoijcleaow = ru.myspar.proloyalty.core.ui.view.infinitelayoutmanager.zoijcleaow.ppxfxbqfkf(index, iZoijcleaow2);
            if (updateIndex) {
                this.bottomRightIndex = iZoijcleaow;
            }
        } else {
            if (!z14 || !z16) {
                throw new IllegalStateException("Invalid move & adapter direction combination.");
            }
            iZoijcleaow = ru.myspar.proloyalty.core.ui.view.infinitelayoutmanager.zoijcleaow.zoijcleaow(index, iZoijcleaow2);
            if (updateIndex) {
                this.bottomRightIndex = iZoijcleaow;
            }
        }
        return iZoijcleaow;
    }

    static /* synthetic */ int V0(InfiniteLayoutManager infiniteLayoutManager, int i13, int i14, RecyclerView.zynmafqrjb zynmafqrjbVar, boolean z13, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            z13 = true;
        }
        return infiniteLayoutManager.U0(i13, i14, zynmafqrjbVar, z13);
    }

    private final boolean W0(View view) {
        if (this.orientation == 0) {
            if (rlfsiqarku(view) < I0() || yfnezrywwk(view) > iwxlajgraz() - J0()) {
                return false;
            }
        } else if (ydmasvzmpa(view) < K0() || xrmfcynszj(view) > zfvoamnweg() - H0()) {
            return false;
        }
        return true;
    }

    private final boolean X0(View view) {
        if (this.orientation == 0) {
            if (yfnezrywwk(view) <= I0() || rlfsiqarku(view) >= iwxlajgraz() - J0()) {
                return false;
            }
        } else if (xrmfcynszj(view) <= K0() || ydmasvzmpa(view) >= zfvoamnweg() - H0()) {
            return false;
        }
        return true;
    }

    private final boolean Y0(int adapterIndex) {
        Iterator it = v0(adapterIndex).iterator();
        while (it.hasNext()) {
            if (W0((View) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final int p0() {
        return 0;
    }

    private final int q0() {
        return vipkmwdibw() == 0 ? 0 : 100;
    }

    private final int r0() {
        return vipkmwdibw() == 0 ? 0 : 200;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PointF s0(int targetPosition, int count) {
        int iIntValue = ((Number) this.smoothScrollDirectionDecider.invoke(Integer.valueOf(targetPosition), this, Integer.valueOf(count))).intValue();
        return this.orientation == 0 ? new PointF(iIntValue, 0.0f) : new PointF(0.0f, iIntValue);
    }

    private final View u0(int adapterIndex, int movementDir, RecyclerView.iwizpuwonk recycler) {
        View viewOjitshcjhn = recycler.ojitshcjhn(adapterIndex);
        zdlpuopuiu.dxjokdxxww(viewOjitshcjhn, "getViewForPosition(...)");
        if (movementDir == -1) {
            yggfygwlhe(viewOjitshcjhn, 0);
        } else {
            zdlpuopuiu(viewOjitshcjhn);
        }
        ixidwrxhsl(viewOjitshcjhn, 0, 0);
        return viewOjitshcjhn;
    }

    private final Iterable v0(int adapterIndex) {
        ArrayList arrayList = new ArrayList();
        int iVipkmwdibw = vipkmwdibw();
        for (int i13 = 0; i13 < iVipkmwdibw; i13++) {
            View viewRibwqtqdhb = ribwqtqdhb(i13);
            if (viewRibwqtqdhb != null && lrnfpwlwnk(viewRibwqtqdhb) == adapterIndex) {
                arrayList.add(viewRibwqtqdhb);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int x0(int movementDir) {
        boolean z13 = this.orientation == 1;
        boolean z14 = movementDir == -1;
        boolean zM0 = M0();
        boolean z15 = this.reverseLayout;
        if (!z13 || !z14 || z15) {
            if (z13 && z14 && z15) {
                return 1;
            }
            if (z13 && !z14 && !z15) {
                return 1;
            }
            if ((!z13 || z14 || !z15) && (z13 || !z14 || zM0 || z15)) {
                if (!z13 && z14 && !zM0 && z15) {
                    return 1;
                }
                if (!z13 && z14 && zM0 && !z15) {
                    return 1;
                }
                if (z13 || !z14 || !zM0 || !z15) {
                    if (!z13 && !z14 && !zM0 && !z15) {
                        return 1;
                    }
                    if ((z13 || z14 || zM0 || !z15) && (z13 || z14 || !zM0 || z15)) {
                        if (z13 || z14 || !zM0 || !z15) {
                            throw new IllegalStateException("Invalid movement state.");
                        }
                        return 1;
                    }
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int z0(int movementDir) {
        return movementDir == -1 ? this.topLeftIndex : this.bottomRightIndex;
    }

    public final int C0() {
        return (zfvoamnweg() - K0()) - H0();
    }

    public final int D0() {
        return (iwxlajgraz() - I0()) - J0();
    }

    /* JADX INFO: renamed from: G0, reason: from getter */
    public final int getOrientation() {
        return this.orientation;
    }

    /* JADX INFO: renamed from: L0, reason: from getter */
    public final int getTopLeftIndex() {
        return this.topLeftIndex;
    }

    public final boolean M0() {
        return bfopjjpdmp() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int P(int dx2, RecyclerView.iwizpuwonk recycler, RecyclerView.zynmafqrjb state) {
        zdlpuopuiu.btonecajqb(recycler, "recycler");
        zdlpuopuiu.btonecajqb(state, "state");
        return Q0(dx2, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void Q(int adapterIndex) {
        R0(adapterIndex, dxjokdxxww.f95372zdlpuopuiu);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int R(int dy2, RecyclerView.iwizpuwonk recycler, RecyclerView.zynmafqrjb state) {
        zdlpuopuiu.btonecajqb(recycler, "recycler");
        zdlpuopuiu.btonecajqb(state, "state");
        return Q0(dy2, recycler, state);
    }

    public final void R0(int adapterIndex, vdvldrhtss strategy) {
        zdlpuopuiu.btonecajqb(strategy, "strategy");
        if (Y0(adapterIndex)) {
            return;
        }
        this.layoutRequest = new LayoutRequest(adapterIndex, 0, 0, strategy, null, null, 54, null);
        M();
    }

    public final void S0(int i13) {
        if (i13 != 0 && i13 != 1) {
            throw new IllegalArgumentException(("invalid orientation:" + i13).toString());
        }
        if (i13 == this.orientation) {
            if (this.orientationHelper == null) {
                this.orientationHelper = yggfygwlhe.zoijcleaow(this, i13);
            }
        } else {
            this.orientationHelper = yggfygwlhe.zoijcleaow(this, i13);
            iwizpuwonk(null);
            this.orientation = i13;
            M();
        }
    }

    public final void T0(boolean z13) {
        if (z13 == this.reverseLayout) {
            return;
        }
        iwizpuwonk(null);
        this.reverseLayout = z13;
        M();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void b0(RecyclerView recyclerView, RecyclerView.zynmafqrjb state, int position) {
        zdlpuopuiu.btonecajqb(recyclerView, "recyclerView");
        zdlpuopuiu.btonecajqb(state, "state");
        Context context = recyclerView.getContext();
        zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
        lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg(this, context, state);
        lqeggnwhkgVar.setTargetPosition(position);
        c0(lqeggnwhkgVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void d(RecyclerView.iwizpuwonk recycler, RecyclerView.zynmafqrjb state, AccessibilityEvent event) {
        zdlpuopuiu.btonecajqb(recycler, "recycler");
        zdlpuopuiu.btonecajqb(state, "state");
        zdlpuopuiu.btonecajqb(event, "event");
        super.d(recycler, state, event);
        if (vipkmwdibw() > 0) {
            event.setFromIndex(this.topLeftIndex);
            event.setToIndex(this.bottomRightIndex);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int hcddaimhww(RecyclerView.zynmafqrjb state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return q0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int jpowsppfya(RecyclerView.zynmafqrjb state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return r0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int lmojexxdyd(RecyclerView.zynmafqrjb state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return p0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public boolean lxfrhoxuzk() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public View mbcevpiqjq(int adapterIndex) {
        return w0(adapterIndex, nufgyqmvbu.f95379zdlpuopuiu);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public RecyclerView.vdvldrhtss ntlheqmsrt() {
        return new RecyclerView.vdvldrhtss(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void p(RecyclerView.iwizpuwonk recycler, RecyclerView.zynmafqrjb state) {
        Rect rectPpxfxbqfkf;
        int i13;
        int iD0;
        int i14;
        zdlpuopuiu.btonecajqb(recycler, "recycler");
        zdlpuopuiu.btonecajqb(state, "state");
        this.layoutRequest.lqeggnwhkg(this, state);
        hkdspvbjdz(recycler);
        int iE0 = E0(-this.layoutRequest.ppxfxbqfkf());
        int iD1 = this.orientation == 0 ? D0() : C0();
        int iBtonecajqb = gtknphoqwx.btonecajqb(this.layoutRequest.eablkybsjg(), state.zoijcleaow() - 1);
        gxszxtbevo gxszxtbevoVar = null;
        int iWkgbmnqykc = 0;
        while (iWkgbmnqykc < iD1) {
            View viewU0 = u0(iBtonecajqb, iE0, recycler);
            gxszxtbevo gxszxtbevoVarB0 = B0(iE0, viewU0);
            Rect rectF0 = F0(viewU0);
            if (gxszxtbevoVar == null || (rectPpxfxbqfkf = gxszxtbevoVar.zoijcleaow(gxszxtbevoVarB0, rectF0)) == null) {
                rectPpxfxbqfkf = gxszxtbevoVarB0.ppxfxbqfkf(rectF0, this.layoutRequest.gxszxtbevo());
            }
            mhtqkkgtqm(viewU0, rectPpxfxbqfkf.left, rectPpxfxbqfkf.top, rectPpxfxbqfkf.right, rectPpxfxbqfkf.bottom);
            iBtonecajqb = U0(iBtonecajqb, iE0, state, false);
            if (iWkgbmnqykc == 0) {
                if (this.reverseLayout) {
                    if (M0()) {
                        if (this.orientation == 0) {
                            i13 = rectPpxfxbqfkf.left;
                            iWkgbmnqykc = i13;
                        } else {
                            iD0 = C0();
                            i14 = rectPpxfxbqfkf.bottom;
                        }
                    } else if (this.orientation == 0) {
                        iD0 = D0();
                        i14 = rectPpxfxbqfkf.right;
                    } else {
                        iD0 = C0();
                        i14 = rectPpxfxbqfkf.bottom;
                    }
                    iWkgbmnqykc = iD0 - i14;
                } else {
                    if (!M0()) {
                        i13 = this.orientation == 0 ? rectPpxfxbqfkf.left : rectPpxfxbqfkf.top;
                    } else if (this.orientation == 0) {
                        iD0 = D0();
                        i14 = rectPpxfxbqfkf.right;
                        iWkgbmnqykc = iD0 - i14;
                    } else {
                        i13 = rectPpxfxbqfkf.top;
                    }
                    iWkgbmnqykc = i13;
                }
            }
            iWkgbmnqykc += gxszxtbevoVarB0.wkgbmnqykc();
            gxszxtbevoVar = gxszxtbevoVarB0;
        }
        if (iE0 == -1) {
            this.bottomRightIndex = this.layoutRequest.eablkybsjg();
            this.topLeftIndex = U0(iBtonecajqb, -iE0, state, false);
        } else {
            this.topLeftIndex = this.layoutRequest.eablkybsjg();
            this.bottomRightIndex = U0(iBtonecajqb, -iE0, state, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int pkzmftpjix(RecyclerView.zynmafqrjb state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return p0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public boolean pmvmpeiblj() {
        return this.orientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void q(RecyclerView.zynmafqrjb state) {
        super.q(state);
        this.layoutRequest.zoijcleaow();
    }

    public final int t0(int adapterDir) {
        return E0(adapterDir);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void u(Parcelable state) {
        if (state instanceof LayoutRequest) {
            this.layoutRequest = (LayoutRequest) state;
            M();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public Parcelable v() {
        int iE0 = E0(-1);
        if (vipkmwdibw() == 0) {
            return null;
        }
        return new LayoutRequest(z0(iE0), A0(iE0).iobyxmoadg(), 0, null, null, null, 60, null);
    }

    public final View w0(int adapterIndex, tg.rgvfuqvkyq strategy) {
        zdlpuopuiu.btonecajqb(strategy, "strategy");
        return (View) strategy.invoke(Integer.valueOf(adapterIndex), this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int wwaezpbzkn(RecyclerView.zynmafqrjb state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return q0();
    }

    /* JADX INFO: renamed from: y0, reason: from getter */
    public final int getBottomRightIndex() {
        return this.bottomRightIndex;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public int ylkuphrtab(RecyclerView.zynmafqrjb state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return r0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.pmvmpeiblj.zoijcleaow
    public PointF zoijcleaow(int targetPosition) {
        return s0(targetPosition, iobyxmoadg());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public boolean zynmafqrjb() {
        return this.orientation == 1;
    }

    public /* synthetic */ InfiniteLayoutManager(int i13, boolean z13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? 1 : i13, (i14 & 2) != 0 ? false : z13);
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u0000 )2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006Bc\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\"\b\u0002\u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0002\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0003J\u001f\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\b\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00078F@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001aR$\u0010\t\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00078F@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u001aR$\u0010\n\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00078F@BX\u0086\u000e¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001aR0\u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lru/myspar/proloyalty/core/ui/view/infinitelayoutmanager/InfiniteLayoutManager$LayoutRequest;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "anchorIndex", "scrollOffset", "adapterDirection", "Lkotlin/Function3;", "Lru/myspar/proloyalty/core/ui/view/infinitelayoutmanager/InfiniteLayoutManager;", "scrollStrategy", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$zynmafqrjb;", "state", "(IIILtg/vdvldrhtss;Lru/myspar/proloyalty/core/ui/view/infinitelayoutmanager/InfiniteLayoutManager;Landroidx/recyclerview/widget/RecyclerView$zynmafqrjb;)V", "Lgg/wwaezpbzkn;", "lqeggnwhkg", "(Lru/myspar/proloyalty/core/ui/view/infinitelayoutmanager/InfiniteLayoutManager;Landroidx/recyclerview/widget/RecyclerView$zynmafqrjb;)V", "zoijcleaow", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "value", "zdlpuopuiu", "I", "eablkybsjg", "yggfygwlhe", "gxszxtbevo", "jyumaefscl", "ppxfxbqfkf", "iwizpuwonk", "Ltg/vdvldrhtss;", "", "cqumvgiudr", "Z", "hasBeenInitialized", "CREATOR", "iobyxmoadg", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class LayoutRequest implements Parcelable {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata */
        private boolean hasBeenInitialized;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
        private vdvldrhtss scrollStrategy;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
        private int adapterDirection;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
        private int scrollOffset;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
        private int anchorIndex;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.core.ui.view.infinitelayoutmanager.InfiniteLayoutManager$LayoutRequest$iobyxmoadg, reason: from kotlin metadata */
        public static final class Companion implements Parcelable.Creator {
            public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public LayoutRequest createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new LayoutRequest(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public LayoutRequest[] newArray(int i13) {
                LayoutRequest[] layoutRequestArr = new LayoutRequest[i13];
                for (int i14 = 0; i14 < i13; i14++) {
                    layoutRequestArr[i14] = new LayoutRequest();
                }
                return layoutRequestArr;
            }

            private Companion() {
            }
        }

        public LayoutRequest() {
            this.anchorIndex = -1;
            this.adapterDirection = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final int eablkybsjg() {
            if (this.hasBeenInitialized) {
                return this.anchorIndex;
            }
            throw new IllegalStateException("LayoutRequest has not been initialized.");
        }

        public final int gxszxtbevo() {
            if (this.hasBeenInitialized) {
                return this.scrollOffset;
            }
            throw new IllegalStateException("LayoutRequest has not been initialized.");
        }

        public final void lqeggnwhkg(InfiniteLayoutManager layoutManager, RecyclerView.zynmafqrjb state) {
            zdlpuopuiu.btonecajqb(layoutManager, "layoutManager");
            zdlpuopuiu.btonecajqb(state, "state");
            if (this.hasBeenInitialized) {
                return;
            }
            this.hasBeenInitialized = true;
            vdvldrhtss vdvldrhtssVar = this.scrollStrategy;
            this.adapterDirection = vdvldrhtssVar != null ? layoutManager.x0(((Number) vdvldrhtssVar.invoke(Integer.valueOf(eablkybsjg()), layoutManager, Integer.valueOf(state.zoijcleaow()))).intValue()) : ppxfxbqfkf();
            if (eablkybsjg() == -1) {
                if (layoutManager.vipkmwdibw() == 0) {
                    this.anchorIndex = 0;
                    return;
                }
                int iE0 = layoutManager.E0(ppxfxbqfkf());
                this.anchorIndex = layoutManager.z0(iE0);
                this.scrollOffset = layoutManager.A0(iE0).iobyxmoadg();
            }
        }

        public final int ppxfxbqfkf() {
            if (this.hasBeenInitialized) {
                return this.adapterDirection;
            }
            throw new IllegalStateException("LayoutRequest has not been initialized.");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            parcel.writeInt(eablkybsjg());
            parcel.writeInt(gxszxtbevo());
            parcel.writeInt(ppxfxbqfkf());
        }

        public final void zoijcleaow() {
            this.anchorIndex = -1;
            this.scrollOffset = 0;
            this.adapterDirection = -1;
            this.scrollStrategy = null;
            this.hasBeenInitialized = false;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public LayoutRequest(Parcel parcel) {
            this();
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            this.anchorIndex = parcel.readInt();
            this.scrollOffset = parcel.readInt();
            this.adapterDirection = parcel.readInt();
        }

        public /* synthetic */ LayoutRequest(int i13, int i14, int i15, vdvldrhtss vdvldrhtssVar, InfiniteLayoutManager infiniteLayoutManager, RecyclerView.zynmafqrjb zynmafqrjbVar, int i16, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this((i16 & 1) != 0 ? -1 : i13, (i16 & 2) != 0 ? 0 : i14, (i16 & 4) == 0 ? i15 : -1, (i16 & 8) != 0 ? null : vdvldrhtssVar, (i16 & 16) != 0 ? null : infiniteLayoutManager, (i16 & 32) != 0 ? null : zynmafqrjbVar);
        }

        public LayoutRequest(int i13, int i14, int i15, vdvldrhtss vdvldrhtssVar, InfiniteLayoutManager infiniteLayoutManager, RecyclerView.zynmafqrjb zynmafqrjbVar) {
            this();
            this.anchorIndex = i13;
            this.scrollOffset = i14;
            this.adapterDirection = i15;
            this.scrollStrategy = vdvldrhtssVar;
            if (infiniteLayoutManager != null && zynmafqrjbVar != null) {
                lqeggnwhkg(infiniteLayoutManager, zynmafqrjbVar);
            }
            if (this.hasBeenInitialized || i13 == -1 || vdvldrhtssVar != null) {
                return;
            }
            this.hasBeenInitialized = true;
        }
    }

    public InfiniteLayoutManager(int i13, boolean z13) {
        this.layoutRequest = new LayoutRequest(0, 0, 0, null, null, null, 62, null);
        this.smoothScrollDirectionDecider = btonecajqb.f95371zdlpuopuiu;
        S0(i13);
        T0(z13);
    }

    public InfiniteLayoutManager(Context context, AttributeSet attrs, int i13, int i14) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(attrs, "attrs");
        this.layoutRequest = new LayoutRequest(0, 0, 0, null, null, null, 62, null);
        this.smoothScrollDirectionDecider = btonecajqb.f95371zdlpuopuiu;
        RecyclerView.rgvfuqvkyq.wkgbmnqykc wkgbmnqykcVarZeieaojujs = RecyclerView.rgvfuqvkyq.zeieaojujs(context, attrs, i13, i14);
        S0(wkgbmnqykcVarZeieaojujs.f12779iobyxmoadg);
        T0(wkgbmnqykcVarZeieaojujs.f12780ppxfxbqfkf);
    }
}
