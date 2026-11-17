package ru.myspar.proloyalty.specialbanner.impl.presentation.views.map;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import b31.btonecajqb;
import b31.gxszxtbevo;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectTapListener;
import com.yandex.mapkit.mapview.MapView;
import com.yandex.runtime.image.ImageProvider;
import ds1.ppxfxbqfkf;
import gg.gtknphoqwx;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import p41.dxjokdxxww;
import ru.myspar.proloyalty.specialbanner.impl.presentation.views.map.MapSpecialBannerLayoutView;
import tg.draadjrbmk;
import tg.iobyxmoadg;
import z41.g;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00016B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J/\u0010'\u001a\u00020\u000e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0#2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0%¢\u0006\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010-\u001a\u0004\b.\u0010/R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R$\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00067"}, d2 = {"Lru/myspar/proloyalty/specialbanner/impl/presentation/views/map/MapSpecialBannerLayoutView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/yandex/mapkit/map/MapObjectTapListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lds1/ppxfxbqfkf;", "shops", "Lgg/wwaezpbzkn;", "setShops", "(Ljava/util/List;)V", "Lcom/yandex/mapkit/geometry/BoundingBox;", "boundingBox", "zdlpuopuiu", "(Lcom/yandex/mapkit/geometry/BoundingBox;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lcom/yandex/mapkit/map/MapObject;", "mapObject", "Lcom/yandex/mapkit/geometry/Point;", "p1", "", "onMapObjectTap", "(Lcom/yandex/mapkit/map/MapObject;Lcom/yandex/mapkit/geometry/Point;)Z", "Lds1/iobyxmoadg;", "data", "setData", "(Lds1/iobyxmoadg;)V", "Lkotlin/Function0;", "showOnMapClickListener", "Lkotlin/Function1;", "pinClickListener", "yggfygwlhe", "(Ltg/iobyxmoadg;Ltg/draadjrbmk;)V", "Lz41/g;", "Lz41/g;", "binding", "Lir1/gtknphoqwx;", "Lgg/gtknphoqwx;", "getShopsAdapter", "()Lir1/gtknphoqwx;", "shopsAdapter", "jyumaefscl", "Ltg/iobyxmoadg;", "iwizpuwonk", "Ltg/draadjrbmk;", "cqumvgiudr", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MapSpecialBannerLayoutView extends ConstraintLayout implements MapObjectTapListener {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final int f101541esjtqupxsv = 8;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
    private draadjrbmk pinClickListener;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private iobyxmoadg showOnMapClickListener;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx shopsAdapter;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private g binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapSpecialBannerLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    private final ir1.gtknphoqwx getShopsAdapter() {
        return (ir1.gtknphoqwx) this.shopsAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ir1.gtknphoqwx iwizpuwonk() {
        return new ir1.gtknphoqwx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jyumaefscl(ds1.iobyxmoadg iobyxmoadgVar, MapSpecialBannerLayoutView mapSpecialBannerLayoutView) {
        BoundingBox boundingBoxIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        if (boundingBoxIobyxmoadg != null) {
            mapSpecialBannerLayoutView.zdlpuopuiu(boundingBoxIobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void kcexrzcfyt(MapSpecialBannerLayoutView mapSpecialBannerLayoutView, View view) {
        iobyxmoadg iobyxmoadgVar = mapSpecialBannerLayoutView.showOnMapClickListener;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
    }

    private final void setShops(List<ppxfxbqfkf> shops) {
        ImageProvider imageProviderFromResource = ImageProvider.fromResource(getContext(), btonecajqb.marker);
        MapView mapView = this.binding.f128016ppxfxbqfkf;
        zdlpuopuiu.lqeggnwhkg(mapView);
        tt0.iobyxmoadg.iobyxmoadg(mapView);
        for (ppxfxbqfkf ppxfxbqfkfVar : shops) {
            mapView.getMapWindow().getMap().getMapObjects().addPlacemark(ppxfxbqfkfVar.wkgbmnqykc(), imageProviderFromResource).setUserData(ppxfxbqfkfVar);
        }
    }

    private final void zdlpuopuiu(BoundingBox boundingBox) {
        Map map = this.binding.f128016ppxfxbqfkf.getMap();
        CameraPosition cameraPosition = map.cameraPosition(Geometry.fromBoundingBox(boundingBox));
        zdlpuopuiu.dxjokdxxww(cameraPosition, "cameraPosition(...)");
        map.move(new CameraPosition(cameraPosition.getTarget(), cameraPosition.getZoom() == map.getCameraBounds().getMaxZoom() ? 16.0f : cameraPosition.getZoom() - 0.08f, cameraPosition.getAzimuth(), cameraPosition.getTilt()));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.binding.f128016ppxfxbqfkf.onStart();
        MapKitFactory.getInstance().onStart();
        this.binding.f128016ppxfxbqfkf.getMap().getMapObjects().addTapListener(this);
        Map map = this.binding.f128016ppxfxbqfkf.getMap();
        Context context = getContext();
        zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
        map.setNightModeEnabled(p41.ppxfxbqfkf.eablkybsjg(context));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.binding.f128016ppxfxbqfkf.onStop();
        MapKitFactory.getInstance().onStop();
        this.binding.f128016ppxfxbqfkf.getMap().getMapObjects().removeTapListener(this);
        super.onDetachedFromWindow();
    }

    @Override // com.yandex.mapkit.map.MapObjectTapListener
    public boolean onMapObjectTap(MapObject mapObject, Point p13) {
        zdlpuopuiu.btonecajqb(mapObject, "mapObject");
        zdlpuopuiu.btonecajqb(p13, "p1");
        if (mapObject.getUserData() == null) {
            return false;
        }
        draadjrbmk draadjrbmkVar = this.pinClickListener;
        if (draadjrbmkVar == null) {
            return true;
        }
        Object userData = mapObject.getUserData();
        zdlpuopuiu.nufgyqmvbu(userData, "null cannot be cast to non-null type ru.myspar.proloyalty.specialbanner.impl.presentation.models.map.ShopItemUiModel");
        draadjrbmkVar.invoke((ppxfxbqfkf) userData);
        return true;
    }

    public final void setData(final ds1.iobyxmoadg data) {
        zdlpuopuiu.btonecajqb(data, "data");
        setShops(data.wkgbmnqykc());
        this.binding.getRoot().post(new Runnable() { // from class: ws1.iobyxmoadg
            @Override // java.lang.Runnable
            public final void run() {
                MapSpecialBannerLayoutView.jyumaefscl(data, this);
            }
        });
        getShopsAdapter().wkgbmnqykc(data.wkgbmnqykc());
    }

    public final void yggfygwlhe(iobyxmoadg showOnMapClickListener, draadjrbmk pinClickListener) {
        zdlpuopuiu.btonecajqb(showOnMapClickListener, "showOnMapClickListener");
        zdlpuopuiu.btonecajqb(pinClickListener, "pinClickListener");
        this.showOnMapClickListener = showOnMapClickListener;
        this.pinClickListener = pinClickListener;
    }

    public /* synthetic */ MapSpecialBannerLayoutView(Context context, AttributeSet attributeSet, int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapSpecialBannerLayoutView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        g gVarZoijcleaow = g.zoijcleaow(dxjokdxxww.nufgyqmvbu(this), this);
        zdlpuopuiu.dxjokdxxww(gVarZoijcleaow, "inflate(...)");
        this.binding = gVarZoijcleaow;
        this.shopsAdapter = gg.draadjrbmk.zoijcleaow(new iobyxmoadg() { // from class: ws1.zoijcleaow
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MapSpecialBannerLayoutView.iwizpuwonk();
            }
        });
        androidx.recyclerview.widget.dxjokdxxww dxjokdxxwwVar = new androidx.recyclerview.widget.dxjokdxxww(context, 1);
        Drawable drawable = androidx.core.content.iobyxmoadg.getDrawable(context, gxszxtbevo.shape_item_divider);
        if (drawable != null) {
            dxjokdxxwwVar.nufgyqmvbu(drawable);
            g gVar = this.binding;
            gVar.f128016ppxfxbqfkf.getMap().setZoomGesturesEnabled(false);
            gVar.f128016ppxfxbqfkf.getMap().setScrollGesturesEnabled(false);
            gVar.f128016ppxfxbqfkf.getMap().setTiltGesturesEnabled(false);
            gVar.f128016ppxfxbqfkf.getMap().setRotateGesturesEnabled(false);
            gVar.f128017wkgbmnqykc.setLayoutManager(new LinearLayoutManager(context));
            gVar.f128017wkgbmnqykc.btonecajqb(dxjokdxxwwVar);
            gVar.f128017wkgbmnqykc.setAdapter(getShopsAdapter());
            gVar.f128013eablkybsjg.setOnClickListener(new View.OnClickListener() { // from class: ws1.ppxfxbqfkf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MapSpecialBannerLayoutView.kcexrzcfyt(this.f120614zdlpuopuiu, view);
                }
            });
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
