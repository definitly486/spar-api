package com.aitsuki.swipe;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import hg.jyumaefscl;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import v1.jhduphickx;
import x7.iobyxmoadg;
import zg.gtknphoqwx;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 \u0083\u00012\u00020\u0001:\u0010\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010#J\u000f\u0010*\u001a\u00020\nH\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b/\u0010\u000eJ\u0017\u00100\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b0\u0010\u000eJ\u0017\u00101\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b1\u0010\u000eJ\u0015\u00104\u001a\u00020\f2\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b8\u00107J\u000f\u00109\u001a\u00020\fH\u0016¢\u0006\u0004\b9\u0010#J\u000f\u0010:\u001a\u00020\fH\u0014¢\u0006\u0004\b:\u0010#J\u001f\u0010=\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u0006H\u0014¢\u0006\u0004\b=\u0010>J7\u0010D\u001a\u00020\f2\u0006\u0010?\u001a\u00020\n2\u0006\u0010@\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u0006H\u0014¢\u0006\u0004\bD\u0010EJ\u000f\u0010G\u001a\u00020FH\u0014¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020F2\u0006\u0010I\u001a\u00020FH\u0014¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\n2\u0006\u0010I\u001a\u00020FH\u0014¢\u0006\u0004\bL\u0010MJ\u0019\u0010J\u001a\u00020F2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\bJ\u0010NR$\u0010R\u001a\u0012\u0012\u0004\u0012\u00020\u00130Oj\b\u0012\u0004\u0012\u00020\u0013`P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010QR\u0016\u0010T\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010SR\"\u0010X\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010U\u001a\u0004\bV\u0010+\"\u0004\bW\u0010\u000eR\u0014\u0010Y\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010SR\u0014\u0010Z\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010SR\u0016\u0010[\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010UR\u0016\u0010\\\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010SR\u0016\u0010]\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010SR\u0016\u0010_\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010UR\u001c\u0010c\u001a\n a*\u0004\u0018\u00010`0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010bR\u0016\u0010d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010SR\u0018\u0010f\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010eR\"\u0010l\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR$\u0010n\u001a\u0012\u0012\u0004\u0012\u0002020Oj\b\u0012\u0004\u0012\u000202`P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010QR\u0018\u0010p\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010eR\u0018\u0010r\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010eR\u0018\u0010t\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010eR\u0014\u0010x\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010z\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010UR+\u0010\u0080\u0001\u001a\u00020\u00062\u0006\u0010{\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b|\u0010S\u001a\u0004\b}\u0010~\"\u0004\b\u007f\u0010\u0012R\u0016\u0010\u0082\u0001\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010+¨\u0006\u008c\u0001"}, d2 = {"Lcom/aitsuki/swipe/SwipeLayout;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "animate", "Lgg/wwaezpbzkn;", "gtknphoqwx", "(Z)V", "pmvmpeiblj", "activeState", "iozdgvuglv", "(I)V", "Landroid/view/View;", "menuView", "zdlpuopuiu", "(Landroid/view/View;)V", "yggfygwlhe", "", "offset", "jyumaefscl", "(Landroid/view/View;F)V", "Landroid/view/MotionEvent;", "ev", "btonecajqb", "(Landroid/view/MotionEvent;)V", "cdpycssgdh", "kcexrzcfyt", "yadqdtsiqt", "()V", "x", "y", "esjtqupxsv", "(II)Z", "lereixgezr", "istkbnxepw", "cqumvgiudr", "()Z", "direction", "iwizpuwonk", "(I)I", "ojitshcjhn", "wflxmlrfwp", "vdvldrhtss", "Lcom/aitsuki/swipe/SwipeLayout$wkgbmnqykc;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "dxjokdxxww", "(Lcom/aitsuki/swipe/SwipeLayout$wkgbmnqykc;)V", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onInterceptTouchEvent", "computeScroll", "onDetachedFromWindow", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/view/ViewGroup$LayoutParams;", "generateDefaultLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "p", "generateLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;", "checkLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)Z", "(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "matchParentChildren", "I", "preview", "Z", "getAutoClose", "setAutoClose", "autoClose", "touchSlop", "velocity", "isDragging", "downX", "downY", "zynmafqrjb", "autoClosePending", "Lb2/ppxfxbqfkf;", "kotlin.jvm.PlatformType", "Lb2/ppxfxbqfkf;", "dragger", "openState", "Landroid/view/View;", "activeMenu", "F", "getOnScreen$library_release", "()F", "setOnScreen$library_release", "(F)V", "onScreen", "lmojexxdyd", "listeners", "wwaezpbzkn", "contentView", "ylkuphrtab", "leftMenu", "pkzmftpjix", "rightMenu", "Lcom/aitsuki/swipe/SwipeLayout$zoijcleaow;", "hcddaimhww", "Lcom/aitsuki/swipe/SwipeLayout$zoijcleaow;", "designer", "jpowsppfya", "initDesigner", "value", "hkdspvbjdz", "getSwipeFlags", "()I", "setSwipeFlags", "swipeFlags", "getSwipeEnable$library_release", "swipeEnable", "cllcsxoeiz", "ClassicDesigner", "iobyxmoadg", "zoijcleaow", "ppxfxbqfkf", "wkgbmnqykc", "OverlayDesigner", "ParallaxDesigner", "eablkybsjg", "library_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SwipeLayout extends ViewGroup {

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private static final ThreadLocal f20536dsvhmnatus = new ThreadLocal();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    private int openState;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata */
    private final int velocity;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    private boolean isDragging;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name and from kotlin metadata */
    private final zoijcleaow designer;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name and from kotlin metadata */
    private int swipeFlags;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    private float onScreen;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final b2.ppxfxbqfkf dragger;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
    private final int touchSlop;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name and from kotlin metadata */
    private boolean initDesigner;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private boolean autoClose;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    private int downX;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    private final ArrayList listeners;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata */
    private View rightMenu;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private int downY;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata */
    private View contentView;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    private View activeMenu;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private int preview;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata */
    private View leftMenu;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final ArrayList matchParentChildren;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private boolean autoClosePending;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0012\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/aitsuki/swipe/SwipeLayout$ClassicDesigner;", "Lcom/aitsuki/swipe/SwipeLayout$zoijcleaow;", "<init>", "()V", "Lcom/aitsuki/swipe/SwipeLayout;", "parent", "Landroid/view/View;", "leftMenu", "rightMenu", "Lgg/wwaezpbzkn;", "iobyxmoadg", "(Lcom/aitsuki/swipe/SwipeLayout;Landroid/view/View;Landroid/view/View;)V", "menuView", "", "left", "top", "right", "bottom", "zoijcleaow", "(Landroid/view/View;IIII)V", "Landroid/view/View;", "library_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class ClassicDesigner implements zoijcleaow {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
        private View leftMenu;

        @Override // com.aitsuki.swipe.SwipeLayout.zoijcleaow
        public void iobyxmoadg(SwipeLayout parent, View leftMenu, View rightMenu) {
            zdlpuopuiu.btonecajqb(parent, "parent");
            this.leftMenu = leftMenu;
            if (leftMenu != null) {
                leftMenu.setVisibility(4);
            }
            if (rightMenu == null) {
                return;
            }
            rightMenu.setVisibility(4);
        }

        @Override // com.aitsuki.swipe.SwipeLayout.zoijcleaow
        public void zoijcleaow(View menuView, int left, int top, int right, int bottom) {
            zdlpuopuiu.btonecajqb(menuView, "menuView");
            menuView.setVisibility(right - left > 0 ? 0 : 4);
            if (zdlpuopuiu.eablkybsjg(menuView, this.leftMenu)) {
                menuView.layout(right - menuView.getWidth(), menuView.getTop(), right, menuView.getBottom());
            } else {
                menuView.layout(left, menuView.getTop(), menuView.getWidth() + left, menuView.getBottom());
            }
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0012\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/aitsuki/swipe/SwipeLayout$OverlayDesigner;", "Lcom/aitsuki/swipe/SwipeLayout$zoijcleaow;", "<init>", "()V", "Lcom/aitsuki/swipe/SwipeLayout;", "parent", "Landroid/view/View;", "leftMenu", "rightMenu", "Lgg/wwaezpbzkn;", "iobyxmoadg", "(Lcom/aitsuki/swipe/SwipeLayout;Landroid/view/View;Landroid/view/View;)V", "menuView", "", "left", "top", "right", "bottom", "zoijcleaow", "(Landroid/view/View;IIII)V", "Landroid/view/View;", "library_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class OverlayDesigner implements zoijcleaow {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
        private View leftMenu;

        @Override // com.aitsuki.swipe.SwipeLayout.zoijcleaow
        public void iobyxmoadg(SwipeLayout parent, View leftMenu, View rightMenu) {
            zdlpuopuiu.btonecajqb(parent, "parent");
            this.leftMenu = leftMenu;
            if (leftMenu != null) {
                leftMenu.setVisibility(4);
            }
            if (rightMenu == null) {
                return;
            }
            rightMenu.setVisibility(4);
        }

        @Override // com.aitsuki.swipe.SwipeLayout.zoijcleaow
        public void zoijcleaow(View menuView, int left, int top, int right, int bottom) {
            zdlpuopuiu.btonecajqb(menuView, "menuView");
            int i13 = right - left;
            menuView.setVisibility(i13 > 0 ? 0 : 4);
            if (zdlpuopuiu.eablkybsjg(menuView, this.leftMenu)) {
                if (i13 == 0) {
                    menuView.layout(left - menuView.getWidth(), menuView.getTop(), left, menuView.getBottom());
                    return;
                } else {
                    menuView.layout(left, menuView.getTop(), menuView.getWidth() + left, menuView.getBottom());
                    return;
                }
            }
            if (i13 == 0) {
                menuView.layout(right, menuView.getTop(), menuView.getWidth() + right, menuView.getBottom());
            } else {
                menuView.layout(right - menuView.getWidth(), menuView.getTop(), right, menuView.getBottom());
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u000bJ+\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/aitsuki/swipe/SwipeLayout$ParallaxDesigner;", "Lcom/aitsuki/swipe/SwipeLayout$zoijcleaow;", "<init>", "()V", "Landroid/view/ViewGroup;", "menuView", "", "left", "right", "Lgg/wwaezpbzkn;", "ppxfxbqfkf", "(Landroid/view/ViewGroup;II)V", "wkgbmnqykc", "Lcom/aitsuki/swipe/SwipeLayout;", "parent", "Landroid/view/View;", "leftMenu", "rightMenu", "iobyxmoadg", "(Lcom/aitsuki/swipe/SwipeLayout;Landroid/view/View;Landroid/view/View;)V", "top", "bottom", "zoijcleaow", "(Landroid/view/View;IIII)V", "Landroid/view/View;", "library_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class ParallaxDesigner implements zoijcleaow {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata */
        private View leftMenu;

        private final void ppxfxbqfkf(ViewGroup menuView, int left, int right) {
            float width = (right - left) / menuView.getWidth();
            View childAt = menuView.getChildAt(0);
            int width2 = menuView.getWidth();
            childAt.layout(width2 - childAt.getWidth(), childAt.getTop(), width2, childAt.getBottom());
            int childCount = menuView.getChildCount();
            int i13 = 1;
            while (i13 < childCount) {
                int i14 = i13 + 1;
                View childAt2 = menuView.getChildAt(i13);
                int right2 = (int) (childAt.getRight() - (childAt.getWidth() * width));
                childAt2.layout(right2 - childAt2.getWidth(), childAt2.getTop(), right2, childAt2.getBottom());
                childAt = childAt2;
                i13 = i14;
            }
        }

        private final void wkgbmnqykc(ViewGroup menuView, int left, int right) {
            float width = (right - left) / menuView.getWidth();
            View childAt = menuView.getChildAt(menuView.getChildCount() - 1);
            int width2 = menuView.getWidth() - ((int) (childAt.getWidth() * width));
            childAt.layout(width2, childAt.getTop(), childAt.getWidth() + width2, childAt.getBottom());
            int childCount = menuView.getChildCount() - 2;
            if (childCount < 0) {
                return;
            }
            while (true) {
                int i13 = childCount - 1;
                View childAt2 = menuView.getChildAt(childCount);
                int left2 = (int) (childAt.getLeft() - (childAt2.getWidth() * width));
                childAt2.layout(left2, childAt2.getTop(), childAt2.getWidth() + left2, childAt2.getBottom());
                if (i13 < 0) {
                    return;
                }
                childAt = childAt2;
                childCount = i13;
            }
        }

        @Override // com.aitsuki.swipe.SwipeLayout.zoijcleaow
        public void iobyxmoadg(SwipeLayout parent, View leftMenu, View rightMenu) {
            zdlpuopuiu.btonecajqb(parent, "parent");
            this.leftMenu = leftMenu;
            if (leftMenu != null) {
                leftMenu.setVisibility(4);
            }
            if (rightMenu == null) {
                return;
            }
            rightMenu.setVisibility(4);
        }

        @Override // com.aitsuki.swipe.SwipeLayout.zoijcleaow
        public void zoijcleaow(View menuView, int left, int top, int right, int bottom) {
            zdlpuopuiu.btonecajqb(menuView, "menuView");
            int i13 = right - left;
            menuView.setVisibility(i13 > 0 ? 0 : 4);
            if (zdlpuopuiu.eablkybsjg(menuView, this.leftMenu)) {
                if (i13 == 0) {
                    menuView.layout(left - menuView.getWidth(), menuView.getTop(), left, menuView.getBottom());
                    return;
                }
                menuView.layout(right - menuView.getWidth(), menuView.getTop(), right, menuView.getBottom());
                if (menuView instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) menuView;
                    if (viewGroup.getChildCount() > 1) {
                        ppxfxbqfkf(viewGroup, left, right);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i13 == 0) {
                menuView.layout(right, menuView.getTop(), menuView.getWidth() + right, menuView.getBottom());
                return;
            }
            menuView.layout(right - menuView.getWidth(), menuView.getTop(), right, menuView.getBottom());
            if (menuView instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) menuView;
                if (viewGroup2.getChildCount() > 0) {
                    wkgbmnqykc(viewGroup2, left, right);
                }
            }
        }
    }

    private final class eablkybsjg extends b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ SwipeLayout f20560iobyxmoadg;

        public eablkybsjg(SwipeLayout this$0) {
            zdlpuopuiu.btonecajqb(this$0, "this$0");
            this.f20560iobyxmoadg = this$0;
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public void btonecajqb(int i13) {
            this.f20560iobyxmoadg.iozdgvuglv(i13);
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public void draadjrbmk(View releasedChild, float f13, float f14) {
            zdlpuopuiu.btonecajqb(releasedChild, "releasedChild");
            View view = this.f20560iobyxmoadg.activeMenu;
            if (view == null) {
                return;
            }
            if (zdlpuopuiu.eablkybsjg(view, this.f20560iobyxmoadg.leftMenu)) {
                if (f13 > this.f20560iobyxmoadg.velocity) {
                    SwipeLayout.zynmafqrjb(this.f20560iobyxmoadg, false, 1, null);
                    return;
                }
                if (f13 < (-this.f20560iobyxmoadg.velocity)) {
                    SwipeLayout.draadjrbmk(this.f20560iobyxmoadg, false, 1, null);
                    return;
                } else if (this.f20560iobyxmoadg.getOnScreen() > 0.5f) {
                    SwipeLayout.zynmafqrjb(this.f20560iobyxmoadg, false, 1, null);
                    return;
                } else {
                    SwipeLayout.draadjrbmk(this.f20560iobyxmoadg, false, 1, null);
                    return;
                }
            }
            if (f13 < (-this.f20560iobyxmoadg.velocity)) {
                SwipeLayout.zynmafqrjb(this.f20560iobyxmoadg, false, 1, null);
                return;
            }
            if (f13 > this.f20560iobyxmoadg.velocity) {
                SwipeLayout.draadjrbmk(this.f20560iobyxmoadg, false, 1, null);
            } else if (this.f20560iobyxmoadg.getOnScreen() > 0.5f) {
                SwipeLayout.zynmafqrjb(this.f20560iobyxmoadg, false, 1, null);
            } else {
                SwipeLayout.draadjrbmk(this.f20560iobyxmoadg, false, 1, null);
            }
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public void gtknphoqwx(View child, int i13, int i14, int i15, int i16) {
            zdlpuopuiu.btonecajqb(child, "child");
            this.f20560iobyxmoadg.yadqdtsiqt();
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public int iobyxmoadg(View child, int i13, int i14) {
            View view;
            zdlpuopuiu.btonecajqb(child, "child");
            View view2 = this.f20560iobyxmoadg.contentView;
            if (view2 != null && (view = this.f20560iobyxmoadg.activeMenu) != null) {
                if (zdlpuopuiu.eablkybsjg(child, view2)) {
                    return zdlpuopuiu.eablkybsjg(view, this.f20560iobyxmoadg.leftMenu) ? gtknphoqwx.agtfadlqog(i13, this.f20560iobyxmoadg.getPaddingLeft(), view.getWidth() + this.f20560iobyxmoadg.getPaddingLeft()) : gtknphoqwx.agtfadlqog(i13, this.f20560iobyxmoadg.getPaddingLeft() - view.getWidth(), this.f20560iobyxmoadg.getPaddingLeft());
                }
                if (zdlpuopuiu.eablkybsjg(child, this.f20560iobyxmoadg.leftMenu)) {
                    jhduphickx.jlmebxxoox(view2, gtknphoqwx.agtfadlqog(view2.getLeft() + i14, this.f20560iobyxmoadg.getPaddingLeft(), child.getWidth() + this.f20560iobyxmoadg.getPaddingLeft()) - view2.getLeft());
                } else if (zdlpuopuiu.eablkybsjg(child, this.f20560iobyxmoadg.rightMenu)) {
                    jhduphickx.jlmebxxoox(view2, gtknphoqwx.agtfadlqog(view2.getLeft() + i14, this.f20560iobyxmoadg.getPaddingLeft() - child.getWidth(), this.f20560iobyxmoadg.getPaddingLeft()) - view2.getLeft());
                }
                return child.getLeft();
            }
            return child.getLeft();
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public boolean wflxmlrfwp(View child, int i13) {
            zdlpuopuiu.btonecajqb(child, "child");
            return this.f20560iobyxmoadg.getSwipeEnable$library_release() && (zdlpuopuiu.eablkybsjg(child, this.f20560iobyxmoadg.contentView) || zdlpuopuiu.eablkybsjg(child, this.f20560iobyxmoadg.leftMenu) || zdlpuopuiu.eablkybsjg(child, this.f20560iobyxmoadg.rightMenu));
        }

        @Override // b2.ppxfxbqfkf.AbstractC0251ppxfxbqfkf
        public int zoijcleaow(View child, int i13, int i14) {
            zdlpuopuiu.btonecajqb(child, "child");
            return child.getTop();
        }
    }

    public interface wkgbmnqykc {

        public static final class iobyxmoadg {
            public static void iobyxmoadg(wkgbmnqykc wkgbmnqykcVar, View menuView) {
                zdlpuopuiu.btonecajqb(wkgbmnqykcVar, "this");
                zdlpuopuiu.btonecajqb(menuView, "menuView");
            }

            public static void ppxfxbqfkf(wkgbmnqykc wkgbmnqykcVar, View menuView, int i13) {
                zdlpuopuiu.btonecajqb(wkgbmnqykcVar, "this");
                zdlpuopuiu.btonecajqb(menuView, "menuView");
            }

            public static void zoijcleaow(wkgbmnqykc wkgbmnqykcVar, View menuView, float f13) {
                zdlpuopuiu.btonecajqb(wkgbmnqykcVar, "this");
                zdlpuopuiu.btonecajqb(menuView, "menuView");
            }
        }

        void iobyxmoadg(View view);

        void ppxfxbqfkf(View view, int i13);

        void wkgbmnqykc(View view, float f13);

        void zoijcleaow(View view);
    }

    public interface zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f20562iobyxmoadg = iobyxmoadg.f20563iobyxmoadg;

        public static final class iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            static final /* synthetic */ iobyxmoadg f20563iobyxmoadg = new iobyxmoadg();

            private iobyxmoadg() {
            }

            public final zoijcleaow iobyxmoadg(Context context, String str) {
                zdlpuopuiu.btonecajqb(context, "context");
                if (str == null || str.length() == 0) {
                    return null;
                }
                if (kcexrzcfyt.stevsuqkhv(str, ".", false, 2, null)) {
                    str = zdlpuopuiu.oxmwwwfdhm(context.getPackageName(), str);
                }
                try {
                    Map linkedHashMap = (Map) SwipeLayout.f20536dsvhmnatus.get();
                    if (linkedHashMap == null) {
                        linkedHashMap = new LinkedHashMap();
                    }
                    if (((Constructor) linkedHashMap.get(str)) != null) {
                        return null;
                    }
                    Class<?> cls = Class.forName(str, false, context.getClassLoader());
                    if (cls == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<com.aitsuki.swipe.SwipeLayout.Designer>");
                    }
                    Constructor<?> constructor = cls.getConstructor(null);
                    constructor.setAccessible(true);
                    linkedHashMap.put(str, constructor);
                    return (zoijcleaow) constructor.newInstance(null);
                } catch (Exception e13) {
                    throw new RuntimeException(zdlpuopuiu.oxmwwwfdhm("Could not inflate Designer subclass ", str), e13);
                }
            }
        }

        void iobyxmoadg(SwipeLayout swipeLayout, View view, View view2);

        void zoijcleaow(View view, int i13, int i14, int i15, int i16);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwipeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    public static /* synthetic */ void agtfadlqog(SwipeLayout swipeLayout, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = true;
        }
        swipeLayout.wflxmlrfwp(z13);
    }

    private final void btonecajqb(MotionEvent ev2) {
        if (this.isDragging) {
            return;
        }
        int x13 = ((int) ev2.getX()) - this.downX;
        int y13 = ((int) ev2.getY()) - this.downY;
        boolean z13 = true;
        boolean z14 = x13 < (-this.touchSlop) && Math.abs(x13) > Math.abs(y13);
        boolean z15 = x13 > this.touchSlop && x13 > Math.abs(y13);
        int iIwizpuwonk = iwizpuwonk(this.swipeFlags);
        boolean z16 = (iIwizpuwonk & 1) != 0;
        boolean z17 = (iIwizpuwonk & 2) != 0;
        int i13 = this.openState;
        if ((i13 & 1) == 1 || (i13 & 2) == 2) {
            if (esjtqupxsv(this.downX, this.downY)) {
                this.isDragging = true;
            } else if (lereixgezr(this.downX, this.downY)) {
                if (!z14 && !z15) {
                    z13 = false;
                }
                this.isDragging = z13;
            }
        } else if (z15 && z17) {
            View view = this.leftMenu;
            this.activeMenu = view;
            this.isDragging = view != null;
        } else if (z14 && z16) {
            View view2 = this.rightMenu;
            this.activeMenu = view2;
            this.isDragging = view2 != null;
        }
        if (this.isDragging) {
            MotionEvent motionEventObtain = MotionEvent.obtain(ev2);
            motionEventObtain.setAction(0);
            this.dragger.istkbnxepw(motionEventObtain);
        }
    }

    private final void cdpycssgdh(MotionEvent ev2) {
        int actionMasked = ev2.getActionMasked();
        if (actionMasked == 0) {
            this.downX = (int) ev2.getX();
            int y13 = (int) ev2.getY();
            this.downY = y13;
            if (this.autoClose || esjtqupxsv(this.downX, y13)) {
                this.autoClosePending = true;
                return;
            }
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                boolean z13 = this.isDragging;
                btonecajqb(ev2);
                if (this.isDragging) {
                    this.dragger.istkbnxepw(ev2);
                }
                if (!z13 && this.isDragging) {
                    requestDisallowInterceptTouchEvent(true);
                    MotionEvent motionEventObtain = MotionEvent.obtain(ev2);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                }
                kcexrzcfyt(ev2);
                return;
            }
            if (actionMasked != 3) {
                if (this.isDragging) {
                    this.dragger.istkbnxepw(ev2);
                    return;
                }
                return;
            }
        }
        if (this.isDragging) {
            this.dragger.istkbnxepw(ev2);
            this.isDragging = false;
            requestDisallowInterceptTouchEvent(false);
        }
        if (this.autoClosePending) {
            draadjrbmk(this, false, 1, null);
        }
        this.autoClosePending = false;
    }

    private final boolean cqumvgiudr() {
        return jhduphickx.lereixgezr(this) == 1;
    }

    static /* synthetic */ void draadjrbmk(SwipeLayout swipeLayout, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = true;
        }
        swipeLayout.gtknphoqwx(z13);
    }

    private final boolean esjtqupxsv(int x13, int y13) {
        View view = this.contentView;
        if (view == null) {
            return false;
        }
        return zdlpuopuiu.eablkybsjg(view, this.dragger.kcexrzcfyt(x13, y13));
    }

    private final void gtknphoqwx(boolean animate) {
        View view = this.activeMenu;
        if (view == null) {
            this.openState = 0;
            return;
        }
        View view2 = this.contentView;
        if (view2 == null || view == null) {
            return;
        }
        if (animate) {
            this.openState |= 4;
            this.dragger.cllcsxoeiz(view2, getPaddingLeft(), view2.getTop());
        } else {
            jhduphickx.jlmebxxoox(view2, (-view2.getLeft()) + getPaddingLeft());
            jyumaefscl(view, 0.0f);
            iozdgvuglv(0);
        }
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void iozdgvuglv(int activeState) {
        View view = this.activeMenu;
        if (view == null) {
            return;
        }
        Iterator it = jyumaefscl.ntlheqmsrt(this.listeners).iterator();
        while (it.hasNext()) {
            ((wkgbmnqykc) it.next()).ppxfxbqfkf(view, activeState);
        }
        if (activeState == 0) {
            if (this.onScreen == 1.0f) {
                yggfygwlhe(view);
            } else {
                zdlpuopuiu(view);
            }
        }
    }

    private final void istkbnxepw() {
        View view;
        int i13 = this.preview;
        if (i13 == 1) {
            view = this.leftMenu;
        } else if (i13 == 2) {
            view = this.rightMenu;
        } else if (i13 == 3) {
            view = cqumvgiudr() ? this.rightMenu : this.leftMenu;
        } else if (i13 != 4) {
            view = null;
        } else {
            view = cqumvgiudr() ? this.leftMenu : this.rightMenu;
        }
        this.activeMenu = view;
        pmvmpeiblj(false);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0012 A[PHI: r3
      0x0012: PHI (r3v6 int) = (r3v1 int), (r3v8 int) binds: [B:13:0x0024, B:7:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0015 A[PHI: r3
      0x0015: PHI (r3v2 int) = (r3v1 int), (r3v8 int) binds: [B:13:0x0024, B:7:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    private final int iwizpuwonk(int direction) {
        int i13;
        if ((direction & 4096) <= 0) {
            return direction;
        }
        if ((direction & 4097) == 4097) {
            i13 = direction & (-4098);
            if (cqumvgiudr()) {
                direction = i13 | 2;
            } else {
                direction = i13 | 1;
            }
        } else if ((direction & 4098) == 4098) {
            i13 = direction & (-4099);
            if (cqumvgiudr()) {
                direction = i13 | 1;
            } else {
                direction = i13 | 2;
            }
        }
        return direction & (-4097);
    }

    private final void jyumaefscl(View menuView, float offset) {
        this.onScreen = offset;
        Iterator it = jyumaefscl.ntlheqmsrt(this.listeners).iterator();
        while (it.hasNext()) {
            ((wkgbmnqykc) it.next()).wkgbmnqykc(menuView, offset);
        }
    }

    private final void kcexrzcfyt(MotionEvent ev2) {
        int x13 = (int) (ev2.getX() - this.downX);
        int y13 = (int) (ev2.getY() - this.downY);
        int i13 = (x13 * x13) + (y13 * y13);
        int i14 = this.touchSlop;
        if (i13 > i14 * i14) {
            this.autoClosePending = false;
        }
    }

    private final boolean lereixgezr(int x13, int y13) {
        View view = this.activeMenu;
        if (view == null) {
            return false;
        }
        return zdlpuopuiu.eablkybsjg(view, this.dragger.kcexrzcfyt(x13, y13));
    }

    public static /* synthetic */ void oxmwwwfdhm(SwipeLayout swipeLayout, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = true;
        }
        swipeLayout.vdvldrhtss(z13);
    }

    private final void pmvmpeiblj(boolean animate) {
        int width;
        int paddingLeft;
        View view = this.activeMenu;
        if (view == null) {
            this.openState = 0;
            return;
        }
        View view2 = this.contentView;
        if (view2 == null || view == null) {
            return;
        }
        if (zdlpuopuiu.eablkybsjg(view, this.leftMenu)) {
            width = view.getWidth();
            paddingLeft = getPaddingLeft();
        } else {
            width = -view.getWidth();
            paddingLeft = getPaddingLeft();
        }
        int i13 = width + paddingLeft;
        if (animate) {
            this.openState |= 2;
            this.dragger.cllcsxoeiz(view2, i13, view2.getTop());
            invalidate();
        } else {
            jhduphickx.jlmebxxoox(view2, i13 - view2.getLeft());
            jyumaefscl(view, 1.0f);
            iozdgvuglv(0);
            requestLayout();
        }
    }

    public static /* synthetic */ void rgvfuqvkyq(SwipeLayout swipeLayout, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = true;
        }
        swipeLayout.ojitshcjhn(z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yadqdtsiqt() {
        View view;
        float right;
        View view2 = this.contentView;
        if (view2 == null || (view = this.activeMenu) == null) {
            return;
        }
        if (zdlpuopuiu.eablkybsjg(view, this.leftMenu)) {
            right = (view2.getLeft() - getPaddingLeft()) / view.getWidth();
            this.designer.zoijcleaow(view, getPaddingLeft(), getPaddingTop(), view2.getLeft(), getBottom() - getPaddingBottom());
        } else {
            right = (((getRight() - getLeft()) - getPaddingRight()) - view2.getRight()) / view.getWidth();
            this.designer.zoijcleaow(view, view2.getRight(), getPaddingTop(), (getRight() - getLeft()) - getPaddingRight(), getBottom() - getPaddingBottom());
        }
        if (this.onScreen == right) {
            return;
        }
        jyumaefscl(view, right);
    }

    private final void yggfygwlhe(View menuView) {
        if ((this.openState & 1) == 0) {
            Iterator it = jyumaefscl.ntlheqmsrt(this.listeners).iterator();
            while (it.hasNext()) {
                ((wkgbmnqykc) it.next()).zoijcleaow(menuView);
            }
        }
        this.openState = 1;
    }

    private final void zdlpuopuiu(View menuView) {
        if ((this.openState & 1) == 1) {
            Iterator it = jyumaefscl.ntlheqmsrt(this.listeners).iterator();
            while (it.hasNext()) {
                ((wkgbmnqykc) it.next()).iobyxmoadg(menuView);
            }
        }
        this.openState = 0;
    }

    static /* synthetic */ void zynmafqrjb(SwipeLayout swipeLayout, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = true;
        }
        swipeLayout.pmvmpeiblj(z13);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams p13) {
        zdlpuopuiu.btonecajqb(p13, "p");
        return (p13 instanceof ppxfxbqfkf) && super.checkLayoutParams(p13);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.dragger.draadjrbmk(true)) {
            jhduphickx.xrmfcynszj(this);
        }
    }

    public final void dxjokdxxww(wkgbmnqykc listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.listeners.add(listener);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ppxfxbqfkf(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p13) {
        zdlpuopuiu.btonecajqb(p13, "p");
        return p13 instanceof ppxfxbqfkf ? new ppxfxbqfkf((ppxfxbqfkf) p13) : new ppxfxbqfkf(p13);
    }

    public final boolean getAutoClose() {
        return this.autoClose;
    }

    /* JADX INFO: renamed from: getOnScreen$library_release, reason: from getter */
    public final float getOnScreen() {
        return this.onScreen;
    }

    public final boolean getSwipeEnable$library_release() {
        return (this.swipeFlags & 3) != 0;
    }

    public final int getSwipeFlags() {
        return this.swipeFlags;
    }

    public final void ojitshcjhn(boolean animate) {
        gtknphoqwx(animate);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        if ((this.openState & 4) == 4) {
            this.dragger.iobyxmoadg();
            View view = this.contentView;
            if (view != null) {
                setOnScreen$library_release(0.0f);
                jhduphickx.jlmebxxoox(view, getPaddingLeft() - view.getLeft());
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev2) {
        zdlpuopuiu.btonecajqb(ev2, "ev");
        cdpycssgdh(ev2);
        return this.isDragging;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int i13;
        int i14;
        if (isInEditMode()) {
            istkbnxepw();
        }
        int paddingLeft = getPaddingLeft();
        int paddingRight = (right - left) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (bottom - top) - getPaddingBottom();
        int childCount = getChildCount();
        int i15 = 0;
        while (i15 < childCount) {
            int i16 = i15 + 1;
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.aitsuki.swipe.SwipeLayout.LayoutParams");
                }
                ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) layoutParams;
                int iZoijcleaow = v1.zdlpuopuiu.zoijcleaow(ppxfxbqfkfVar.iobyxmoadg(), jhduphickx.lereixgezr(this));
                int iIobyxmoadg = ppxfxbqfkfVar.iobyxmoadg() & 112;
                int i17 = iZoijcleaow & 7;
                if (i17 != 3) {
                    i13 = i17 != 5 ? paddingLeft : paddingRight + measuredWidth;
                } else {
                    i13 = paddingLeft - measuredWidth;
                }
                if (iIobyxmoadg != 16) {
                    i14 = iIobyxmoadg != 80 ? paddingTop : paddingBottom - measuredHeight;
                } else {
                    i14 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop;
                }
                childAt.layout(i13, i14, measuredWidth + i13, measuredHeight + i14);
            }
            i15 = i16;
        }
        View view = this.contentView;
        if (view != null) {
            View view2 = this.activeMenu;
            if (view2 != null) {
                int width = (int) (view2.getWidth() * this.onScreen);
                if (!zdlpuopuiu.eablkybsjg(view2, this.leftMenu)) {
                    width = -width;
                }
                jhduphickx.jlmebxxoox(view, width);
            }
            View view3 = this.leftMenu;
            if (view3 != null) {
                this.designer.zoijcleaow(view3, paddingLeft, paddingTop, view.getLeft(), paddingBottom);
            }
            View view4 = this.rightMenu;
            if (view4 == null) {
                return;
            }
            this.designer.zoijcleaow(view4, view.getRight(), paddingTop, paddingRight, paddingBottom);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int childCount = getChildCount();
        boolean z13 = (View.MeasureSpec.getMode(widthMeasureSpec) == 1073741824 && View.MeasureSpec.getMode(heightMeasureSpec) == 1073741824) ? false : true;
        this.matchParentChildren.clear();
        int i13 = 0;
        int iGxszxtbevo = 0;
        int iGxszxtbevo2 = 0;
        int iCombineMeasuredStates = 0;
        while (i13 < childCount) {
            int i14 = i13 + 1;
            View childAt = getChildAt(i13);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.aitsuki.swipe.SwipeLayout.LayoutParams");
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) layoutParams;
            if (ppxfxbqfkfVar.iobyxmoadg() == 0) {
                this.contentView = childAt;
            }
            int iZoijcleaow = v1.zdlpuopuiu.zoijcleaow(ppxfxbqfkfVar.iobyxmoadg(), jhduphickx.lereixgezr(childAt)) & 7;
            if (iZoijcleaow == 3) {
                this.leftMenu = childAt;
            } else if (iZoijcleaow == 5) {
                this.rightMenu = childAt;
            }
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, widthMeasureSpec, heightMeasureSpec);
                iGxszxtbevo = gtknphoqwx.gxszxtbevo(iGxszxtbevo, childAt.getMeasuredWidth());
                iGxszxtbevo2 = gtknphoqwx.gxszxtbevo(iGxszxtbevo2, childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                if (z13 && (((ViewGroup.LayoutParams) ppxfxbqfkfVar).width == -1 || ((ViewGroup.LayoutParams) ppxfxbqfkfVar).height == -1)) {
                    this.matchParentChildren.add(childAt);
                }
            }
            i13 = i14;
        }
        if (!this.initDesigner) {
            this.designer.iobyxmoadg(this, this.leftMenu, this.rightMenu);
            this.initDesigner = true;
        }
        setMeasuredDimension(View.resolveSizeAndState(iGxszxtbevo + getPaddingLeft() + getPaddingRight(), widthMeasureSpec, iCombineMeasuredStates), View.resolveSizeAndState(iGxszxtbevo2 + getPaddingTop() + getPaddingBottom(), heightMeasureSpec, iCombineMeasuredStates << 16));
        int size = this.matchParentChildren.size();
        if (size > 1) {
            int i15 = 0;
            while (i15 < size) {
                int i16 = i15 + 1;
                Object obj = this.matchParentChildren.get(i15);
                zdlpuopuiu.dxjokdxxww(obj, "matchParentChildren[i]");
                View view = (View) obj;
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                view.measure(layoutParams2.width == -1 ? View.MeasureSpec.makeMeasureSpec(gtknphoqwx.gxszxtbevo(0, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()), 1073741824) : ViewGroup.getChildMeasureSpec(widthMeasureSpec, getPaddingLeft() + getPaddingRight(), layoutParams2.width), layoutParams2.height == -1 ? View.MeasureSpec.makeMeasureSpec(gtknphoqwx.gxszxtbevo(0, (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()), 1073741824) : ViewGroup.getChildMeasureSpec(heightMeasureSpec, getPaddingTop() + getPaddingBottom(), layoutParams2.height));
                i15 = i16;
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent ev2) {
        zdlpuopuiu.btonecajqb(ev2, "ev");
        cdpycssgdh(ev2);
        return true;
    }

    public final void setAutoClose(boolean z13) {
        this.autoClose = z13;
    }

    public final void setOnScreen$library_release(float f13) {
        this.onScreen = f13;
    }

    public final void setSwipeFlags(int i13) {
        int iIwizpuwonk = iwizpuwonk(i13);
        if ((iIwizpuwonk & 3) == 0) {
            draadjrbmk(this, false, 1, null);
        } else if ((iIwizpuwonk & 1) == 0) {
            oxmwwwfdhm(this, false, 1, null);
        } else if ((iIwizpuwonk & 2) == 0) {
            agtfadlqog(this, false, 1, null);
        }
        this.swipeFlags = i13;
    }

    public final void vdvldrhtss(boolean animate) {
        View view = this.activeMenu;
        if (view != null && zdlpuopuiu.eablkybsjg(view, this.rightMenu)) {
            gtknphoqwx(animate);
        }
    }

    public final void wflxmlrfwp(boolean animate) {
        View view = this.activeMenu;
        if (view != null && zdlpuopuiu.eablkybsjg(view, this.leftMenu)) {
            gtknphoqwx(animate);
        }
    }

    public /* synthetic */ SwipeLayout(Context context, AttributeSet attributeSet, int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeLayout(Context context, AttributeSet attributeSet, int i13) {
        zoijcleaow zoijcleaowVarIobyxmoadg;
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        this.matchParentChildren = new ArrayList(1);
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.velocity = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.dragger = b2.ppxfxbqfkf.agtfadlqog(this, new eablkybsjg(this));
        this.listeners = new ArrayList();
        this.swipeFlags = 3;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iobyxmoadg.SwipeLayout);
            zdlpuopuiu.dxjokdxxww(typedArrayObtainStyledAttributes, "context.obtainStyledAttr… R.styleable.SwipeLayout)");
            this.preview = typedArrayObtainStyledAttributes.getInt(iobyxmoadg.SwipeLayout_preview, this.preview);
            this.autoClose = typedArrayObtainStyledAttributes.getBoolean(iobyxmoadg.SwipeLayout_autoClose, this.autoClose);
            zoijcleaowVarIobyxmoadg = zoijcleaow.f20562iobyxmoadg.iobyxmoadg(context, typedArrayObtainStyledAttributes.getString(iobyxmoadg.SwipeLayout_designer));
            typedArrayObtainStyledAttributes.recycle();
        } else {
            zoijcleaowVarIobyxmoadg = null;
        }
        this.designer = zoijcleaowVarIobyxmoadg == null ? new ClassicDesigner() : zoijcleaowVarIobyxmoadg;
    }

    public static final class ppxfxbqfkf extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private int f20561iobyxmoadg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Context c13, AttributeSet attributeSet) {
            super(c13, attributeSet);
            zdlpuopuiu.btonecajqb(c13, "c");
            TypedArray typedArrayObtainStyledAttributes = c13.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_gravity});
            zdlpuopuiu.dxjokdxxww(typedArrayObtainStyledAttributes, "c.obtainStyledAttributes…d.R.attr.layout_gravity))");
            this.f20561iobyxmoadg = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public final int iobyxmoadg() {
            return this.f20561iobyxmoadg;
        }

        public ppxfxbqfkf(int i13, int i14) {
            super(i13, i14);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(ppxfxbqfkf source) {
            super(source);
            zdlpuopuiu.btonecajqb(source, "source");
            this.f20561iobyxmoadg = source.f20561iobyxmoadg;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(ViewGroup.LayoutParams source) {
            super(source);
            zdlpuopuiu.btonecajqb(source, "source");
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        Context context = getContext();
        zdlpuopuiu.dxjokdxxww(context, "context");
        return new ppxfxbqfkf(context, attrs);
    }
}
