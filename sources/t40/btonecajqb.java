package t40;

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
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class btonecajqb extends draadjrbmk.nufgyqmvbu {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final Paint f109626agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final int f109627btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final ColorDrawable f109628draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final Drawable f109629dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final int f109630gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final tg.draadjrbmk f109631gxszxtbevo;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final int f109632iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int f109633jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final float f109634kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Integer f109635lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final int f109636nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final float f109637ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final Paint f109638oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final String f109639rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final Paint f109640vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final RectF f109641wflxmlrfwp;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final float f109642yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final float f109643zdlpuopuiu;

    public /* synthetic */ btonecajqb(d60.iobyxmoadg iobyxmoadgVar, int i13, int i14, int i15, tg.draadjrbmk draadjrbmkVar, Integer num, int i16, Integer num2, int i17, gtknphoqwx gtknphoqwxVar) {
        this(iobyxmoadgVar, i13, i14, i15, (i17 & 16) != 0 ? null : draadjrbmkVar, (i17 & 32) != 0 ? Integer.valueOf(s40.draadjrbmk.action_delete) : num, (i17 & 64) != 0 ? s40.gxszxtbevo.ic_delete_trash : i16, (i17 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? Integer.valueOf(s40.eablkybsjg.scan_and_go_swipe_to_delete_left_bounded_rect_radius) : num2);
    }

    private final void iozdgvuglv(int i13) {
        tg.draadjrbmk draadjrbmkVar;
        if (i13 == -1 || (draadjrbmkVar = this.f109631gxszxtbevo) == null) {
            return;
        }
        draadjrbmkVar.invoke(Integer.valueOf(i13));
    }

    private final void yadqdtsiqt(Canvas canvas, View view, float f13) {
        canvas.drawRect(view.getRight() + f13, view.getTop(), view.getRight(), view.getBottom(), this.f109640vdvldrhtss);
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
            float right = (itemView.getRight() - this.f109642yggfygwlhe) - this.f109632iwizpuwonk;
            int right2 = itemView.getRight() + ((int) f13);
            if (f13 == 0.0f && !z13) {
                yadqdtsiqt(c13, itemView, f13);
                super.yggfygwlhe(c13, recyclerView, viewHolder, f13, f14, i13, z13);
                return;
            }
            float bottom = itemView.getBottom() - ((itemView.getHeight() - ((this.f109633jyumaefscl + this.f109643zdlpuopuiu) + this.f109630gtknphoqwx)) / 2);
            float f15 = (bottom - this.f109633jyumaefscl) - this.f109643zdlpuopuiu;
            int i14 = this.f109630gtknphoqwx;
            float f16 = f15 - i14;
            float f17 = i14 + f16;
            float right3 = this.f109639rgvfuqvkyq == null ? (itemView.getRight() - this.f109634kcexrzcfyt) - this.f109627btonecajqb : ((itemView.getRight() - this.f109642yggfygwlhe) - (this.f109632iwizpuwonk / 2)) - (this.f109627btonecajqb / 2);
            float f18 = this.f109627btonecajqb + right3;
            this.f109628draadjrbmk.setBounds(right2, itemView.getTop(), itemView.getRight(), itemView.getBottom());
            this.f109628draadjrbmk.draw(c13);
            String str = this.f109639rgvfuqvkyq;
            if (str != null) {
                c13.drawText(str, right, bottom, this.f109638oxmwwwfdhm);
            }
            Drawable drawable = this.f109629dxjokdxxww;
            if (drawable != null) {
                drawable.setBounds((int) right3, (int) f16, (int) f18, (int) f17);
            }
            Drawable drawable2 = this.f109629dxjokdxxww;
            if (drawable2 != null) {
                drawable2.draw(c13);
            }
            float f19 = right2;
            this.f109641wflxmlrfwp.set(f19 - this.f109637ojitshcjhn, itemView.getTop(), f19 + this.f109637ojitshcjhn, itemView.getBottom());
            RectF rectF = this.f109641wflxmlrfwp;
            float f23 = this.f109637ojitshcjhn;
            c13.drawRoundRect(rectF, f23, f23, this.f109626agtfadlqog);
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
    public btonecajqb(d60.iobyxmoadg resourcesManager, int i13, int i14, int i15, tg.draadjrbmk draadjrbmkVar, Integer num, int i16, Integer num2) {
        int iHeight;
        super(0, 4);
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        int iWidth = 0;
        this.f109631gxszxtbevo = draadjrbmkVar;
        this.f109635lqeggnwhkg = num;
        this.f109636nufgyqmvbu = i16;
        Drawable drawableWkgbmnqykc = resourcesManager.wkgbmnqykc(i16);
        this.f109629dxjokdxxww = drawableWkgbmnqykc;
        this.f109627btonecajqb = drawableWkgbmnqykc != null ? drawableWkgbmnqykc.getIntrinsicWidth() : 0;
        this.f109630gtknphoqwx = drawableWkgbmnqykc != null ? drawableWkgbmnqykc.getIntrinsicHeight() : 0;
        this.f109628draadjrbmk = new ColorDrawable(i13);
        this.f109641wflxmlrfwp = new RectF();
        Paint paint = new Paint();
        paint.setColor(i15);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f109626agtfadlqog = paint;
        this.f109637ojitshcjhn = num2 != null ? resourcesManager.zoijcleaow(s40.eablkybsjg.scan_and_go_swipe_to_delete_left_bounded_rect_radius) : 0.0f;
        String string = num != null ? resourcesManager.getString(s40.draadjrbmk.action_delete) : null;
        this.f109639rgvfuqvkyq = string;
        Paint paint2 = new Paint();
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setAntiAlias(true);
        this.f109640vdvldrhtss = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(i14);
        paint3.setTypeface(resourcesManager.gxszxtbevo(s40.lqeggnwhkg.sf_pro));
        paint3.setTextSize(resourcesManager.ppxfxbqfkf(s40.eablkybsjg.scan_and_go_swipe_to_delete_text_size));
        paint3.setAntiAlias(true);
        this.f109638oxmwwwfdhm = paint3;
        this.f109634kcexrzcfyt = string == null ? resourcesManager.ppxfxbqfkf(s40.eablkybsjg.content_margin_24) : 0.0f;
        this.f109643zdlpuopuiu = string != null ? resourcesManager.ppxfxbqfkf(s40.eablkybsjg.scan_and_go_swipe_to_delete_text_vertical_margin) : 0.0f;
        this.f109642yggfygwlhe = string != null ? resourcesManager.ppxfxbqfkf(s40.eablkybsjg.scan_and_go_swipe_to_delete_text_horizontal_margin) : 0.0f;
        if (string != null) {
            Rect rect = new Rect();
            paint3.getTextBounds(string, 0, string.length(), rect);
            iHeight = rect.height();
        } else {
            iHeight = 0;
        }
        this.f109633jyumaefscl = iHeight;
        if (string != null) {
            Rect rect2 = new Rect();
            paint3.getTextBounds(string, 0, string.length(), rect2);
            iWidth = rect2.width();
        }
        this.f109632iwizpuwonk = iWidth;
    }
}
