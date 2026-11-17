package androidx.fragment.app;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class ListFragment extends Fragment {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    boolean f9172cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    ListView f9173cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    View f9174esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    CharSequence f9175istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    ListAdapter f9176iwizpuwonk;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    TextView f9178lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    View f9179pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    View f9182zynmafqrjb;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Handler f9181zdlpuopuiu = new Handler();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Runnable f9180yggfygwlhe = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f9177jyumaefscl = new zoijcleaow();

    class iobyxmoadg implements Runnable {
        iobyxmoadg() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListView listView = ListFragment.this.f9173cqumvgiudr;
            listView.focusableViewAvailable(listView);
        }
    }

    class zoijcleaow implements AdapterView.OnItemClickListener {
        zoijcleaow() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i13, long j13) {
            ListFragment.this.yadqdtsiqt((ListView) adapterView, view, i13, j13);
        }
    }

    private void cdpycssgdh() {
        if (this.f9173cqumvgiudr != null) {
            return;
        }
        View view = getView();
        if (view == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof ListView) {
            this.f9173cqumvgiudr = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(16711681);
            this.f9178lereixgezr = textView;
            if (textView == null) {
                this.f9174esjtqupxsv = view.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.f9179pmvmpeiblj = view.findViewById(16711682);
            this.f9182zynmafqrjb = view.findViewById(16711683);
            View viewFindViewById = view.findViewById(R.id.list);
            if (!(viewFindViewById instanceof ListView)) {
                if (viewFindViewById != null) {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            ListView listView = (ListView) viewFindViewById;
            this.f9173cqumvgiudr = listView;
            View view2 = this.f9174esjtqupxsv;
            if (view2 != null) {
                listView.setEmptyView(view2);
            } else {
                CharSequence charSequence = this.f9175istkbnxepw;
                if (charSequence != null) {
                    this.f9178lereixgezr.setText(charSequence);
                    this.f9173cqumvgiudr.setEmptyView(this.f9178lereixgezr);
                }
            }
        }
        this.f9172cdpycssgdh = true;
        this.f9173cqumvgiudr.setOnItemClickListener(this.f9177jyumaefscl);
        ListAdapter listAdapter = this.f9176iwizpuwonk;
        if (listAdapter != null) {
            this.f9176iwizpuwonk = null;
            iozdgvuglv(listAdapter);
        } else if (this.f9179pmvmpeiblj != null) {
            lmojexxdyd(false, false);
        }
        this.f9181zdlpuopuiu.post(this.f9180yggfygwlhe);
    }

    private void lmojexxdyd(boolean z13, boolean z14) {
        cdpycssgdh();
        View view = this.f9179pmvmpeiblj;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.f9172cdpycssgdh == z13) {
            return;
        }
        this.f9172cdpycssgdh = z13;
        if (z13) {
            if (z14) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
                this.f9182zynmafqrjb.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
            } else {
                view.clearAnimation();
                this.f9182zynmafqrjb.clearAnimation();
            }
            this.f9179pmvmpeiblj.setVisibility(8);
            this.f9182zynmafqrjb.setVisibility(0);
            return;
        }
        if (z14) {
            view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
            this.f9182zynmafqrjb.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
        } else {
            view.clearAnimation();
            this.f9182zynmafqrjb.clearAnimation();
        }
        this.f9179pmvmpeiblj.setVisibility(0);
        this.f9182zynmafqrjb.setVisibility(8);
    }

    public void iozdgvuglv(ListAdapter listAdapter) {
        boolean z13 = this.f9176iwizpuwonk != null;
        this.f9176iwizpuwonk = listAdapter;
        ListView listView = this.f9173cqumvgiudr;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (this.f9172cdpycssgdh || z13) {
                return;
            }
            lmojexxdyd(true, requireView().getWindowToken() != null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context contextRequireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(contextRequireContext);
        LinearLayout linearLayout = new LinearLayout(contextRequireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(contextRequireContext, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(contextRequireContext);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(contextRequireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(contextRequireContext);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f9181zdlpuopuiu.removeCallbacks(this.f9180yggfygwlhe);
        this.f9173cqumvgiudr = null;
        this.f9172cdpycssgdh = false;
        this.f9182zynmafqrjb = null;
        this.f9179pmvmpeiblj = null;
        this.f9174esjtqupxsv = null;
        this.f9178lereixgezr = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        cdpycssgdh();
    }

    public void yadqdtsiqt(ListView listView, View view, int i13, long j13) {
    }
}
