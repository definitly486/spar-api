package c31;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.draadjrbmk;
import b31.wflxmlrfwp;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class btonecajqb extends draadjrbmk.nufgyqmvbu {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final Paint f18656agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final int f18657btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final ColorDrawable f18658draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final Drawable f18659dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final int f18660gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final tg.draadjrbmk f18661gxszxtbevo;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final int f18662iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int f18663jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final float f18664kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Integer f18665lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final int f18666nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final float f18667ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final Paint f18668oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final String f18669rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final Paint f18670vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final RectF f18671wflxmlrfwp;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final float f18672yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final float f18673zdlpuopuiu;

    public /* synthetic */ btonecajqb(q41.iobyxmoadg iobyxmoadgVar, int i13, int i14, int i15, tg.draadjrbmk draadjrbmkVar, Integer num, int i16, Integer num2, int i17, gtknphoqwx gtknphoqwxVar) {
        this(iobyxmoadgVar, i13, i14, i15, (i17 & 16) != 0 ? null : draadjrbmkVar, (i17 & 32) != 0 ? Integer.valueOf(wflxmlrfwp.proloyalty_action_delete) : num, (i17 & 64) != 0 ? b31.gxszxtbevo.ic_delete_trash : i16, (i17 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? Integer.valueOf(b31.eablkybsjg.scan_and_go_swipe_to_delete_left_bounded_rect_radius) : num2);
    }

    private final void iozdgvuglv(int i13) {
        tg.draadjrbmk draadjrbmkVar;
        if (i13 == -1 || (draadjrbmkVar = this.f18661gxszxtbevo) == null) {
            return;
        }
        draadjrbmkVar.invoke(Integer.valueOf(i13));
    }

    private final void yadqdtsiqt(Canvas canvas, View view, float f13) {
        canvas.drawRect(view.getRight() + f13, view.getTop(), view.getRight(), view.getBottom(), this.f18670vdvldrhtss);
    }

    @Override // androidx.recyclerview.widget.draadjrbmk.eablkybsjg
    public boolean esjtqupxsv(RecyclerView recyclerView, RecyclerView.iozdgvuglv viewHolder, RecyclerView.iozdgvuglv target) {
        zdlpuopuiu.btonecajqb(recyclerView, "recyclerView");
        zdlpuopuiu.btonecajqb(viewHolder, "viewHolder");
        zdlpuopuiu.btonecajqb(target, "target");
        return false;
    }

    public abstract boolean lmojexxdyd(RecyclerView.iozdgvuglv iozdgvuglvVar);

    @Override // androidx.recyclerview.widget.draadjrbmk.eablkybsjg
    public void yggfygwlhe(Canvas c13, RecyclerView recyclerView, RecyclerView.iozdgvuglv viewHolder, float f13, float f14, int i13, boolean z13) {
        zdlpuopuiu.btonecajqb(c13, "c");
        zdlpuopuiu.btonecajqb(recyclerView, "recyclerView");
        zdlpuopuiu.btonecajqb(viewHolder, "viewHolder");
        if (lmojexxdyd(viewHolder)) {
            View itemView = viewHolder.itemView;
            zdlpuopuiu.dxjokdxxww(itemView, "itemView");
            float right = (itemView.getRight() - this.f18672yggfygwlhe) - this.f18662iwizpuwonk;
            int right2 = itemView.getRight() + ((int) f13);
            if (f13 == 0.0f && !z13) {
                yadqdtsiqt(c13, itemView, f13);
                super.yggfygwlhe(c13, recyclerView, viewHolder, f13, f14, i13, z13);
                return;
            }
            float bottom = itemView.getBottom() - ((itemView.getHeight() - ((this.f18663jyumaefscl + this.f18673zdlpuopuiu) + this.f18660gtknphoqwx)) / 2);
            float f15 = (bottom - this.f18663jyumaefscl) - this.f18673zdlpuopuiu;
            int i14 = this.f18660gtknphoqwx;
            float f16 = f15 - i14;
            float f17 = i14 + f16;
            float right3 = this.f18669rgvfuqvkyq == null ? (itemView.getRight() - this.f18664kcexrzcfyt) - this.f18657btonecajqb : ((itemView.getRight() - this.f18672yggfygwlhe) - (this.f18662iwizpuwonk / 2)) - (this.f18657btonecajqb / 2);
            float f18 = this.f18657btonecajqb + right3;
            this.f18658draadjrbmk.setBounds(right2, itemView.getTop(), itemView.getRight(), itemView.getBottom());
            this.f18658draadjrbmk.draw(c13);
            String str = this.f18669rgvfuqvkyq;
            if (str != null) {
                c13.drawText(str, right, bottom, this.f18668oxmwwwfdhm);
            }
            Drawable drawable = this.f18659dxjokdxxww;
            if (drawable != null) {
                drawable.setBounds((int) right3, (int) f16, (int) f18, (int) f17);
            }
            Drawable drawable2 = this.f18659dxjokdxxww;
            if (drawable2 != null) {
                drawable2.draw(c13);
            }
            float f19 = right2;
            this.f18671wflxmlrfwp.set(f19 - this.f18667ojitshcjhn, itemView.getTop(), f19 + this.f18667ojitshcjhn, itemView.getBottom());
            RectF rectF = this.f18671wflxmlrfwp;
            float f23 = this.f18667ojitshcjhn;
            c13.drawRoundRect(rectF, f23, f23, this.f18656agtfadlqog);
            super.yggfygwlhe(c13, recyclerView, viewHolder, f13, f14, i13, z13);
        }
    }

    @Override // androidx.recyclerview.widget.draadjrbmk.eablkybsjg
    public void zynmafqrjb(RecyclerView.iozdgvuglv viewHolder, int i13) {
        zdlpuopuiu.btonecajqb(viewHolder, "viewHolder");
        if (lmojexxdyd(viewHolder)) {
            iozdgvuglv(viewHolder.getBindingAdapterPosition());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btonecajqb(q41.iobyxmoadg resourcesManager, int i13, int i14, int i15, tg.draadjrbmk draadjrbmkVar, Integer num, int i16, Integer num2) {
        int iHeight;
        super(0, 4);
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        int iWidth = 0;
        this.f18661gxszxtbevo = draadjrbmkVar;
        this.f18665lqeggnwhkg = num;
        this.f18666nufgyqmvbu = i16;
        Drawable drawableWkgbmnqykc = resourcesManager.wkgbmnqykc(i16);
        this.f18659dxjokdxxww = drawableWkgbmnqykc;
        this.f18657btonecajqb = drawableWkgbmnqykc != null ? drawableWkgbmnqykc.getIntrinsicWidth() : 0;
        this.f18660gtknphoqwx = drawableWkgbmnqykc != null ? drawableWkgbmnqykc.getIntrinsicHeight() : 0;
        this.f18658draadjrbmk = new ColorDrawable(i13);
        this.f18671wflxmlrfwp = new RectF();
        Paint paint = new Paint();
        paint.setColor(i15);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f18656agtfadlqog = paint;
        this.f18667ojitshcjhn = num2 != null ? resourcesManager.zoijcleaow(b31.eablkybsjg.scan_and_go_swipe_to_delete_left_bounded_rect_radius) : 0.0f;
        String string = num != null ? resourcesManager.getString(wflxmlrfwp.proloyalty_action_delete) : null;
        this.f18669rgvfuqvkyq = string;
        Paint paint2 = new Paint();
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setAntiAlias(true);
        this.f18670vdvldrhtss = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(i14);
        paint3.setTypeface(resourcesManager.gxszxtbevo(b31.lqeggnwhkg.sf_pro));
        paint3.setTextSize(resourcesManager.ppxfxbqfkf(b31.eablkybsjg.scan_and_go_swipe_to_delete_text_size));
        paint3.setAntiAlias(true);
        this.f18668oxmwwwfdhm = paint3;
        this.f18664kcexrzcfyt = string == null ? resourcesManager.ppxfxbqfkf(b31.eablkybsjg.content_margin_24) : 0.0f;
        this.f18673zdlpuopuiu = string != null ? resourcesManager.ppxfxbqfkf(b31.eablkybsjg.scan_and_go_swipe_to_delete_text_vertical_margin) : 0.0f;
        this.f18672yggfygwlhe = string != null ? resourcesManager.ppxfxbqfkf(b31.eablkybsjg.scan_and_go_swipe_to_delete_text_horizontal_margin) : 0.0f;
        if (string != null) {
            Rect rect = new Rect();
            paint3.getTextBounds(string, 0, string.length(), rect);
            iHeight = rect.height();
        } else {
            iHeight = 0;
        }
        this.f18663jyumaefscl = iHeight;
        if (string != null) {
            Rect rect2 = new Rect();
            paint3.getTextBounds(string, 0, string.length(), rect2);
            iWidth = rect2.width();
        }
        this.f18662iwizpuwonk = iWidth;
    }
}
