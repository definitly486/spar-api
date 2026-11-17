package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes.dex */
class AlertController {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f2383btonecajqb;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private ImageView f2384cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    int f2385cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private CharSequence f2386cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private int f2387draadjrbmk;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    int f2388dsvhmnatus;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f2389dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private CharSequence f2390eablkybsjg;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    Message f2391esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private int f2392gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private CharSequence f2393gxszxtbevo;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private int f2394hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    int f2395hkdspvbjdz;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f2396iobyxmoadg;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private TextView f2397iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private Drawable f2398istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    Button f2399iwizpuwonk;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    int f2400jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private Drawable f2401jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    Button f2402kcexrzcfyt;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    Handler f2403kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private Drawable f2404lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private View f2405lmojexxdyd;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    ListView f2406lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private View f2407nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    Button f2408ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private Drawable f2409oxmwwwfdhm;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private int f2410pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    NestedScrollView f2411pmvmpeiblj;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Window f2412ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private CharSequence f2413rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    Message f2416vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private int f2417wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f2418wkgbmnqykc;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    ListAdapter f2419wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private boolean f2420wypolnanlu;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private TextView f2421yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    Message f2422yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private CharSequence f2424zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final rgvfuqvkyq f2425zoijcleaow;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private boolean f2382agtfadlqog = false;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private int f2426zynmafqrjb = 0;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    int f2423ylkuphrtab = -1;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private int f2414stevsuqkhv = 0;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private final View.OnClickListener f2415tzroggbefp = new iobyxmoadg();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final int f2427yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final int f2428zdlpuopuiu;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lqeggnwhkg.btonecajqb.RecycleListView);
            this.f2427yggfygwlhe = typedArrayObtainStyledAttributes.getDimensionPixelOffset(lqeggnwhkg.btonecajqb.RecycleListView_paddingBottomNoButtons, -1);
            this.f2428zdlpuopuiu = typedArrayObtainStyledAttributes.getDimensionPixelOffset(lqeggnwhkg.btonecajqb.RecycleListView_paddingTopNoTitle, -1);
        }

        public void iobyxmoadg(boolean z13, boolean z14) {
            if (z14 && z13) {
                return;
            }
            setPadding(getPaddingLeft(), z13 ? getPaddingTop() : this.f2428zdlpuopuiu, getPaddingRight(), z14 ? getPaddingBottom() : this.f2427yggfygwlhe);
        }
    }

    class iobyxmoadg implements View.OnClickListener {
        iobyxmoadg() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message messageObtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view == alertController.f2408ojitshcjhn && (message3 = alertController.f2416vdvldrhtss) != null) {
                messageObtain = Message.obtain(message3);
            } else if (view != alertController.f2402kcexrzcfyt || (message2 = alertController.f2422yggfygwlhe) == null) {
                messageObtain = (view != alertController.f2399iwizpuwonk || (message = alertController.f2391esjtqupxsv) == null) ? null : Message.obtain(message);
            } else {
                messageObtain = Message.obtain(message2);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f2403kegysxyocb.obtainMessage(1, alertController2.f2425zoijcleaow).sendToTarget();
        }
    }

    private static final class ppxfxbqfkf extends Handler {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private WeakReference f2430iobyxmoadg;

        public ppxfxbqfkf(DialogInterface dialogInterface) {
            this.f2430iobyxmoadg = new WeakReference(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i13 = message.what;
            if (i13 == -3 || i13 == -2 || i13 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f2430iobyxmoadg.get(), message.what);
            } else {
                if (i13 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class wkgbmnqykc extends ArrayAdapter {
        public wkgbmnqykc(Context context, int i13, int i14, CharSequence[] charSequenceArr) {
            super(context, i13, i14, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i13) {
            return i13;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public static class zoijcleaow {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        public DialogInterface.OnClickListener f2431agtfadlqog;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        public Drawable f2432btonecajqb;

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        public int f2433cdpycssgdh;

        /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
        public AdapterView.OnItemSelectedListener f2434cllcsxoeiz;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        public DialogInterface.OnClickListener f2435cqumvgiudr;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        public CharSequence f2436draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        public CharSequence f2438dxjokdxxww;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        public int f2440esjtqupxsv;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        public DialogInterface.OnClickListener f2441gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public CharSequence f2442gxszxtbevo;

        /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
        public Cursor f2443hcddaimhww;

        /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
        public String f2444hkdspvbjdz;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final Context f2445iobyxmoadg;

        /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
        public boolean[] f2446iozdgvuglv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        public int f2447istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        public ListAdapter f2448iwizpuwonk;

        /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
        public String f2449jpowsppfya;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        public CharSequence[] f2450jyumaefscl;

        /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
        public DialogInterface.OnCancelListener f2451kcexrzcfyt;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        public View f2452lereixgezr;

        /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
        public boolean f2453lmojexxdyd;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        public View f2454lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        public CharSequence f2455nufgyqmvbu;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        public CharSequence f2456ojitshcjhn;

        /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
        public DialogInterface.OnMultiChoiceClickListener f2458pkzmftpjix;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        public int f2459pmvmpeiblj;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        public Drawable f2461rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        public DialogInterface.OnClickListener f2462vdvldrhtss;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        public Drawable f2463wflxmlrfwp;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public Drawable f2464wkgbmnqykc;

        /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
        public boolean f2465wwaezpbzkn;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public DialogInterface.OnKeyListener f2467yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public DialogInterface.OnDismissListener f2469zdlpuopuiu;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final LayoutInflater f2470zoijcleaow;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        public int f2471zynmafqrjb;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public int f2460ppxfxbqfkf = 0;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public int f2439eablkybsjg = 0;

        /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
        public boolean f2466yadqdtsiqt = false;

        /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
        public int f2468ylkuphrtab = -1;

        /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
        public boolean f2437dsvhmnatus = true;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        public boolean f2457oxmwwwfdhm = true;

        class iobyxmoadg extends ArrayAdapter {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ RecycleListView f2472iobyxmoadg;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(Context context, int i13, int i14, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i13, i14, charSequenceArr);
                this.f2472iobyxmoadg = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i13, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i13, view, viewGroup);
                boolean[] zArr = zoijcleaow.this.f2446iozdgvuglv;
                if (zArr != null && zArr[i13]) {
                    this.f2472iobyxmoadg.setItemChecked(i13, true);
                }
                return view2;
            }
        }

        class ppxfxbqfkf implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ AlertController f2475zdlpuopuiu;

            ppxfxbqfkf(AlertController alertController) {
                this.f2475zdlpuopuiu = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i13, long j13) {
                zoijcleaow.this.f2435cqumvgiudr.onClick(this.f2475zdlpuopuiu.f2425zoijcleaow, i13);
                if (zoijcleaow.this.f2465wwaezpbzkn) {
                    return;
                }
                this.f2475zdlpuopuiu.f2425zoijcleaow.dismiss();
            }
        }

        class wkgbmnqykc implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ AlertController f2477yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ RecycleListView f2478zdlpuopuiu;

            wkgbmnqykc(RecycleListView recycleListView, AlertController alertController) {
                this.f2478zdlpuopuiu = recycleListView;
                this.f2477yggfygwlhe = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i13, long j13) {
                boolean[] zArr = zoijcleaow.this.f2446iozdgvuglv;
                if (zArr != null) {
                    zArr[i13] = this.f2478zdlpuopuiu.isItemChecked(i13);
                }
                zoijcleaow.this.f2458pkzmftpjix.onClick(this.f2477yggfygwlhe.f2425zoijcleaow, i13, this.f2478zdlpuopuiu.isItemChecked(i13));
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        class C0066zoijcleaow extends CursorAdapter {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final int f2480iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            final /* synthetic */ RecycleListView f2481ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            final /* synthetic */ AlertController f2482wkgbmnqykc;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final int f2483zoijcleaow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0066zoijcleaow(Context context, Cursor cursor, boolean z13, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z13);
                this.f2481ppxfxbqfkf = recycleListView;
                this.f2482wkgbmnqykc = alertController;
                Cursor cursor2 = getCursor();
                this.f2480iobyxmoadg = cursor2.getColumnIndexOrThrow(zoijcleaow.this.f2449jpowsppfya);
                this.f2483zoijcleaow = cursor2.getColumnIndexOrThrow(zoijcleaow.this.f2444hkdspvbjdz);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f2480iobyxmoadg));
                this.f2481ppxfxbqfkf.setItemChecked(cursor.getPosition(), cursor.getInt(this.f2483zoijcleaow) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return zoijcleaow.this.f2470zoijcleaow.inflate(this.f2482wkgbmnqykc.f2395hkdspvbjdz, viewGroup, false);
            }
        }

        public zoijcleaow(Context context) {
            this.f2445iobyxmoadg = context;
            this.f2470zoijcleaow = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void zoijcleaow(AlertController alertController) {
            ListAdapter wkgbmnqykcVar;
            RecycleListView recycleListView = (RecycleListView) this.f2470zoijcleaow.inflate(alertController.f2400jpowsppfya, (ViewGroup) null);
            if (this.f2453lmojexxdyd) {
                wkgbmnqykcVar = this.f2443hcddaimhww == null ? new iobyxmoadg(this.f2445iobyxmoadg, alertController.f2395hkdspvbjdz, R.id.text1, this.f2450jyumaefscl, recycleListView) : new C0066zoijcleaow(this.f2445iobyxmoadg, this.f2443hcddaimhww, false, recycleListView, alertController);
            } else {
                int i13 = this.f2465wwaezpbzkn ? alertController.f2385cllcsxoeiz : alertController.f2388dsvhmnatus;
                if (this.f2443hcddaimhww != null) {
                    wkgbmnqykcVar = new SimpleCursorAdapter(this.f2445iobyxmoadg, i13, this.f2443hcddaimhww, new String[]{this.f2449jpowsppfya}, new int[]{R.id.text1});
                } else {
                    wkgbmnqykcVar = this.f2448iwizpuwonk;
                    if (wkgbmnqykcVar == null) {
                        wkgbmnqykcVar = new wkgbmnqykc(this.f2445iobyxmoadg, i13, R.id.text1, this.f2450jyumaefscl);
                    }
                }
            }
            alertController.f2419wwaezpbzkn = wkgbmnqykcVar;
            alertController.f2423ylkuphrtab = this.f2468ylkuphrtab;
            if (this.f2435cqumvgiudr != null) {
                recycleListView.setOnItemClickListener(new ppxfxbqfkf(alertController));
            } else if (this.f2458pkzmftpjix != null) {
                recycleListView.setOnItemClickListener(new wkgbmnqykc(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2434cllcsxoeiz;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.f2465wwaezpbzkn) {
                recycleListView.setChoiceMode(1);
            } else if (this.f2453lmojexxdyd) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f2406lqeggnwhkg = recycleListView;
        }

        public void iobyxmoadg(AlertController alertController) {
            View view = this.f2454lqeggnwhkg;
            if (view != null) {
                alertController.gtknphoqwx(view);
            } else {
                CharSequence charSequence = this.f2442gxszxtbevo;
                if (charSequence != null) {
                    alertController.rgvfuqvkyq(charSequence);
                }
                Drawable drawable = this.f2464wkgbmnqykc;
                if (drawable != null) {
                    alertController.wflxmlrfwp(drawable);
                }
                int i13 = this.f2460ppxfxbqfkf;
                if (i13 != 0) {
                    alertController.draadjrbmk(i13);
                }
                int i14 = this.f2439eablkybsjg;
                if (i14 != 0) {
                    alertController.draadjrbmk(alertController.ppxfxbqfkf(i14));
                }
            }
            CharSequence charSequence2 = this.f2455nufgyqmvbu;
            if (charSequence2 != null) {
                alertController.agtfadlqog(charSequence2);
            }
            CharSequence charSequence3 = this.f2438dxjokdxxww;
            if (charSequence3 != null || this.f2432btonecajqb != null) {
                alertController.btonecajqb(-1, charSequence3, this.f2441gtknphoqwx, null, this.f2432btonecajqb);
            }
            CharSequence charSequence4 = this.f2436draadjrbmk;
            if (charSequence4 != null || this.f2463wflxmlrfwp != null) {
                alertController.btonecajqb(-2, charSequence4, this.f2431agtfadlqog, null, this.f2463wflxmlrfwp);
            }
            CharSequence charSequence5 = this.f2456ojitshcjhn;
            if (charSequence5 != null || this.f2461rgvfuqvkyq != null) {
                alertController.btonecajqb(-3, charSequence5, this.f2462vdvldrhtss, null, this.f2461rgvfuqvkyq);
            }
            if (this.f2450jyumaefscl != null || this.f2443hcddaimhww != null || this.f2448iwizpuwonk != null) {
                zoijcleaow(alertController);
            }
            View view2 = this.f2452lereixgezr;
            if (view2 != null) {
                if (this.f2466yadqdtsiqt) {
                    alertController.kcexrzcfyt(view2, this.f2459pmvmpeiblj, this.f2471zynmafqrjb, this.f2447istkbnxepw, this.f2433cdpycssgdh);
                    return;
                } else {
                    alertController.oxmwwwfdhm(view2);
                    return;
                }
            }
            int i15 = this.f2440esjtqupxsv;
            if (i15 != 0) {
                alertController.vdvldrhtss(i15);
            }
        }
    }

    public AlertController(Context context, rgvfuqvkyq rgvfuqvkyqVar, Window window) {
        this.f2396iobyxmoadg = context;
        this.f2425zoijcleaow = rgvfuqvkyqVar;
        this.f2412ppxfxbqfkf = window;
        this.f2403kegysxyocb = new ppxfxbqfkf(rgvfuqvkyqVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, lqeggnwhkg.btonecajqb.AlertDialog, lqeggnwhkg.iobyxmoadg.alertDialogStyle, 0);
        this.f2410pkzmftpjix = typedArrayObtainStyledAttributes.getResourceId(lqeggnwhkg.btonecajqb.AlertDialog_android_layout, 0);
        this.f2394hcddaimhww = typedArrayObtainStyledAttributes.getResourceId(lqeggnwhkg.btonecajqb.AlertDialog_buttonPanelSideLayout, 0);
        this.f2400jpowsppfya = typedArrayObtainStyledAttributes.getResourceId(lqeggnwhkg.btonecajqb.AlertDialog_listLayout, 0);
        this.f2395hkdspvbjdz = typedArrayObtainStyledAttributes.getResourceId(lqeggnwhkg.btonecajqb.AlertDialog_multiChoiceItemLayout, 0);
        this.f2385cllcsxoeiz = typedArrayObtainStyledAttributes.getResourceId(lqeggnwhkg.btonecajqb.AlertDialog_singleChoiceItemLayout, 0);
        this.f2388dsvhmnatus = typedArrayObtainStyledAttributes.getResourceId(lqeggnwhkg.btonecajqb.AlertDialog_listItemLayout, 0);
        this.f2420wypolnanlu = typedArrayObtainStyledAttributes.getBoolean(lqeggnwhkg.btonecajqb.AlertDialog_showTitle, true);
        this.f2418wkgbmnqykc = typedArrayObtainStyledAttributes.getDimensionPixelSize(lqeggnwhkg.btonecajqb.AlertDialog_buttonIconDimen, 0);
        typedArrayObtainStyledAttributes.recycle();
        rgvfuqvkyqVar.dxjokdxxww(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void cqumvgiudr() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f2412ppxfxbqfkf.findViewById(lqeggnwhkg.gxszxtbevo.parentPanel);
        View viewFindViewById4 = viewFindViewById3.findViewById(lqeggnwhkg.gxszxtbevo.topPanel);
        View viewFindViewById5 = viewFindViewById3.findViewById(lqeggnwhkg.gxszxtbevo.contentPanel);
        View viewFindViewById6 = viewFindViewById3.findViewById(lqeggnwhkg.gxszxtbevo.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(lqeggnwhkg.gxszxtbevo.customPanel);
        jyumaefscl(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(lqeggnwhkg.gxszxtbevo.topPanel);
        View viewFindViewById8 = viewGroup.findViewById(lqeggnwhkg.gxszxtbevo.contentPanel);
        View viewFindViewById9 = viewGroup.findViewById(lqeggnwhkg.gxszxtbevo.buttonPanel);
        ViewGroup viewGroupNufgyqmvbu = nufgyqmvbu(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupNufgyqmvbu2 = nufgyqmvbu(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupNufgyqmvbu3 = nufgyqmvbu(viewFindViewById9, viewFindViewById6);
        yggfygwlhe(viewGroupNufgyqmvbu2);
        zdlpuopuiu(viewGroupNufgyqmvbu3);
        iwizpuwonk(viewGroupNufgyqmvbu);
        boolean z13 = viewGroup.getVisibility() != 8;
        boolean z14 = (viewGroupNufgyqmvbu == null || viewGroupNufgyqmvbu.getVisibility() == 8) ? 0 : 1;
        boolean z15 = (viewGroupNufgyqmvbu3 == null || viewGroupNufgyqmvbu3.getVisibility() == 8) ? false : true;
        if (!z15 && viewGroupNufgyqmvbu2 != null && (viewFindViewById2 = viewGroupNufgyqmvbu2.findViewById(lqeggnwhkg.gxszxtbevo.textSpacerNoButtons)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z14 != 0) {
            NestedScrollView nestedScrollView = this.f2411pmvmpeiblj;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f2393gxszxtbevo == null && this.f2406lqeggnwhkg == null) ? null : viewGroupNufgyqmvbu.findViewById(lqeggnwhkg.gxszxtbevo.titleDividerNoCustom);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupNufgyqmvbu2 != null && (viewFindViewById = viewGroupNufgyqmvbu2.findViewById(lqeggnwhkg.gxszxtbevo.textSpacerNoTitle)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f2406lqeggnwhkg;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).iobyxmoadg(z14, z15);
        }
        if (!z13) {
            View view = this.f2406lqeggnwhkg;
            if (view == null) {
                view = this.f2411pmvmpeiblj;
            }
            if (view != null) {
                ojitshcjhn(viewGroupNufgyqmvbu2, view, z14 | (z15 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f2406lqeggnwhkg;
        if (listView2 == null || (listAdapter = this.f2419wwaezpbzkn) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i13 = this.f2423ylkuphrtab;
        if (i13 > -1) {
            listView2.setItemChecked(i13, true);
            listView2.setSelection(i13);
        }
    }

    private int dxjokdxxww() {
        int i13 = this.f2394hcddaimhww;
        return (i13 != 0 && this.f2414stevsuqkhv == 1) ? i13 : this.f2410pkzmftpjix;
    }

    private static boolean esjtqupxsv(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(lqeggnwhkg.iobyxmoadg.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    static boolean iobyxmoadg(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (iobyxmoadg(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void iwizpuwonk(ViewGroup viewGroup) {
        if (this.f2405lmojexxdyd != null) {
            viewGroup.addView(this.f2405lmojexxdyd, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f2412ppxfxbqfkf.findViewById(lqeggnwhkg.gxszxtbevo.title_template).setVisibility(8);
            return;
        }
        this.f2384cdpycssgdh = (ImageView) this.f2412ppxfxbqfkf.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f2390eablkybsjg) || !this.f2420wypolnanlu) {
            this.f2412ppxfxbqfkf.findViewById(lqeggnwhkg.gxszxtbevo.title_template).setVisibility(8);
            this.f2384cdpycssgdh.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f2412ppxfxbqfkf.findViewById(lqeggnwhkg.gxszxtbevo.alertTitle);
        this.f2421yadqdtsiqt = textView;
        textView.setText(this.f2390eablkybsjg);
        int i13 = this.f2426zynmafqrjb;
        if (i13 != 0) {
            this.f2384cdpycssgdh.setImageResource(i13);
            return;
        }
        Drawable drawable = this.f2398istkbnxepw;
        if (drawable != null) {
            this.f2384cdpycssgdh.setImageDrawable(drawable);
        } else {
            this.f2421yadqdtsiqt.setPadding(this.f2384cdpycssgdh.getPaddingLeft(), this.f2384cdpycssgdh.getPaddingTop(), this.f2384cdpycssgdh.getPaddingRight(), this.f2384cdpycssgdh.getPaddingBottom());
            this.f2384cdpycssgdh.setVisibility(8);
        }
    }

    private void jyumaefscl(ViewGroup viewGroup) {
        View viewInflate = this.f2407nufgyqmvbu;
        if (viewInflate == null) {
            viewInflate = this.f2389dxjokdxxww != 0 ? LayoutInflater.from(this.f2396iobyxmoadg).inflate(this.f2389dxjokdxxww, viewGroup, false) : null;
        }
        boolean z13 = viewInflate != null;
        if (!z13 || !iobyxmoadg(viewInflate)) {
            this.f2412ppxfxbqfkf.setFlags(131072, 131072);
        }
        if (!z13) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f2412ppxfxbqfkf.findViewById(lqeggnwhkg.gxszxtbevo.custom);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f2382agtfadlqog) {
            frameLayout.setPadding(this.f2383btonecajqb, this.f2392gtknphoqwx, this.f2387draadjrbmk, this.f2417wflxmlrfwp);
        }
        if (this.f2406lqeggnwhkg != null) {
            ((LinearLayout.LayoutParams) ((LinearLayoutCompat.iobyxmoadg) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    private ViewGroup nufgyqmvbu(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private void ojitshcjhn(ViewGroup viewGroup, View view, int i13, int i14) {
        View viewFindViewById = this.f2412ppxfxbqfkf.findViewById(lqeggnwhkg.gxszxtbevo.scrollIndicatorUp);
        View viewFindViewById2 = this.f2412ppxfxbqfkf.findViewById(lqeggnwhkg.gxszxtbevo.scrollIndicatorDown);
        jhduphickx.fiwbwshyhd(view, i13, i14);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    private void yggfygwlhe(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f2412ppxfxbqfkf.findViewById(lqeggnwhkg.gxszxtbevo.scrollView);
        this.f2411pmvmpeiblj = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f2411pmvmpeiblj.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f2397iozdgvuglv = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f2393gxszxtbevo;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f2411pmvmpeiblj.removeView(this.f2397iozdgvuglv);
        if (this.f2406lqeggnwhkg == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f2411pmvmpeiblj.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.f2411pmvmpeiblj);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f2406lqeggnwhkg, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void zdlpuopuiu(ViewGroup viewGroup) {
        int i13;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f2408ojitshcjhn = button;
        button.setOnClickListener(this.f2415tzroggbefp);
        if (TextUtils.isEmpty(this.f2413rgvfuqvkyq) && this.f2409oxmwwwfdhm == null) {
            this.f2408ojitshcjhn.setVisibility(8);
            i13 = 0;
        } else {
            this.f2408ojitshcjhn.setText(this.f2413rgvfuqvkyq);
            Drawable drawable = this.f2409oxmwwwfdhm;
            if (drawable != null) {
                int i14 = this.f2418wkgbmnqykc;
                drawable.setBounds(0, 0, i14, i14);
                this.f2408ojitshcjhn.setCompoundDrawables(this.f2409oxmwwwfdhm, null, null, null);
            }
            this.f2408ojitshcjhn.setVisibility(0);
            i13 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f2402kcexrzcfyt = button2;
        button2.setOnClickListener(this.f2415tzroggbefp);
        if (TextUtils.isEmpty(this.f2424zdlpuopuiu) && this.f2401jyumaefscl == null) {
            this.f2402kcexrzcfyt.setVisibility(8);
        } else {
            this.f2402kcexrzcfyt.setText(this.f2424zdlpuopuiu);
            Drawable drawable2 = this.f2401jyumaefscl;
            if (drawable2 != null) {
                int i15 = this.f2418wkgbmnqykc;
                drawable2.setBounds(0, 0, i15, i15);
                this.f2402kcexrzcfyt.setCompoundDrawables(this.f2401jyumaefscl, null, null, null);
            }
            this.f2402kcexrzcfyt.setVisibility(0);
            i13 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f2399iwizpuwonk = button3;
        button3.setOnClickListener(this.f2415tzroggbefp);
        if (TextUtils.isEmpty(this.f2386cqumvgiudr) && this.f2404lereixgezr == null) {
            this.f2399iwizpuwonk.setVisibility(8);
        } else {
            this.f2399iwizpuwonk.setText(this.f2386cqumvgiudr);
            Drawable drawable3 = this.f2404lereixgezr;
            if (drawable3 != null) {
                int i16 = this.f2418wkgbmnqykc;
                drawable3.setBounds(0, 0, i16, i16);
                this.f2399iwizpuwonk.setCompoundDrawables(this.f2404lereixgezr, null, null, null);
            }
            this.f2399iwizpuwonk.setVisibility(0);
            i13 |= 4;
        }
        if (esjtqupxsv(this.f2396iobyxmoadg)) {
            if (i13 == 1) {
                zoijcleaow(this.f2408ojitshcjhn);
            } else if (i13 == 2) {
                zoijcleaow(this.f2402kcexrzcfyt);
            } else if (i13 == 4) {
                zoijcleaow(this.f2399iwizpuwonk);
            }
        }
        if (i13 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void zoijcleaow(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public void agtfadlqog(CharSequence charSequence) {
        this.f2393gxszxtbevo = charSequence;
        TextView textView = this.f2397iozdgvuglv;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void btonecajqb(int i13, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f2403kegysxyocb.obtainMessage(i13, onClickListener);
        }
        if (i13 == -3) {
            this.f2386cqumvgiudr = charSequence;
            this.f2391esjtqupxsv = message;
            this.f2404lereixgezr = drawable;
        } else if (i13 == -2) {
            this.f2424zdlpuopuiu = charSequence;
            this.f2422yggfygwlhe = message;
            this.f2401jyumaefscl = drawable;
        } else {
            if (i13 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f2413rgvfuqvkyq = charSequence;
            this.f2416vdvldrhtss = message;
            this.f2409oxmwwwfdhm = drawable;
        }
    }

    public void draadjrbmk(int i13) {
        this.f2398istkbnxepw = null;
        this.f2426zynmafqrjb = i13;
        ImageView imageView = this.f2384cdpycssgdh;
        if (imageView != null) {
            if (i13 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f2384cdpycssgdh.setImageResource(this.f2426zynmafqrjb);
            }
        }
    }

    public void eablkybsjg() {
        this.f2425zoijcleaow.setContentView(dxjokdxxww());
        cqumvgiudr();
    }

    public void gtknphoqwx(View view) {
        this.f2405lmojexxdyd = view;
    }

    public boolean gxszxtbevo(int i13, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2411pmvmpeiblj;
        return nestedScrollView != null && nestedScrollView.zdlpuopuiu(keyEvent);
    }

    public void kcexrzcfyt(View view, int i13, int i14, int i15, int i16) {
        this.f2407nufgyqmvbu = view;
        this.f2389dxjokdxxww = 0;
        this.f2382agtfadlqog = true;
        this.f2383btonecajqb = i13;
        this.f2392gtknphoqwx = i14;
        this.f2387draadjrbmk = i15;
        this.f2417wflxmlrfwp = i16;
    }

    public boolean lqeggnwhkg(int i13, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2411pmvmpeiblj;
        return nestedScrollView != null && nestedScrollView.zdlpuopuiu(keyEvent);
    }

    public void oxmwwwfdhm(View view) {
        this.f2407nufgyqmvbu = view;
        this.f2389dxjokdxxww = 0;
        this.f2382agtfadlqog = false;
    }

    public int ppxfxbqfkf(int i13) {
        TypedValue typedValue = new TypedValue();
        this.f2396iobyxmoadg.getTheme().resolveAttribute(i13, typedValue, true);
        return typedValue.resourceId;
    }

    public void rgvfuqvkyq(CharSequence charSequence) {
        this.f2390eablkybsjg = charSequence;
        TextView textView = this.f2421yadqdtsiqt;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void vdvldrhtss(int i13) {
        this.f2407nufgyqmvbu = null;
        this.f2389dxjokdxxww = i13;
        this.f2382agtfadlqog = false;
    }

    public void wflxmlrfwp(Drawable drawable) {
        this.f2398istkbnxepw = drawable;
        this.f2426zynmafqrjb = 0;
        ImageView imageView = this.f2384cdpycssgdh;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f2384cdpycssgdh.setImageDrawable(drawable);
            }
        }
    }

    public ListView wkgbmnqykc() {
        return this.f2406lqeggnwhkg;
    }
}
