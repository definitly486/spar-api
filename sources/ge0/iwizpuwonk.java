package ge0;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f36990iobyxmoadg = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wkgbmnqykc(tg.draadjrbmk draadjrbmkVar, List list, PopupWindow popupWindow, AdapterView adapterView, View view, int i13, long j13) {
        Object obj = list.get(i13);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(obj, "get(...)");
        draadjrbmkVar.invoke(obj);
        popupWindow.dismiss();
    }

    private final int zoijcleaow(Context context, int i13) {
        return (int) (i13 * context.getResources().getDisplayMetrics().density);
    }

    public final PopupWindow ppxfxbqfkf(Activity activity, final tg.draadjrbmk listener) {
        int iWidth;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "activity");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(listener, "listener");
        final PopupWindow popupWindow = new PopupWindow(activity);
        String[] stringArray = activity.getResources().getStringArray(s40.zoijcleaow.genders);
        final List listRgvfuqvkyq = hg.jyumaefscl.rgvfuqvkyq(Arrays.copyOf(stringArray, stringArray.length));
        ArrayAdapter arrayAdapter = new ArrayAdapter(activity, R.layout.simple_dropdown_item_1line, listRgvfuqvkyq);
        ListView listView = new ListView(activity);
        listView.setAdapter((ListAdapter) arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: ge0.jyumaefscl
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i13, long j13) {
                iwizpuwonk.wkgbmnqykc(listener, listRgvfuqvkyq, popupWindow, adapterView, view, i13, j13);
            }
        });
        if (Build.VERSION.SDK_INT < 30) {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            iWidth = point.x;
        } else {
            iWidth = activity.getWindowManager().getCurrentWindowMetrics().getBounds().width();
        }
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(c60.zoijcleaow.ppxfxbqfkf(activity, s40.ppxfxbqfkf.colorSurface2)));
        popupWindow.setWidth(iWidth - zoijcleaow(activity, 32));
        popupWindow.setHeight(-2);
        popupWindow.setContentView(listView);
        return popupWindow;
    }
}
