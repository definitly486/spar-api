package modern.payments.ecomAndroid.presentation.base;

import a6.iobyxmoadg;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0015\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005:\u0001+B'\u0012\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013*\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u00020\u0013*\u00028\u00012\u0006\u0010\u001c\u001a\u00028\u0000H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\u001f\u001a\u00020\u0013*\u00028\u0001H\u0016¢\u0006\u0004\b\u001f\u0010\u0015J\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0001H&¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020\u0001*\u00028\u0000H&¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0001H\u0016¢\u0006\u0004\b%\u0010$J\u0015\u0010&\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0001¢\u0006\u0004\b&\u0010$J%\u0010!\u001a\u00020\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010'J\u0015\u0010(\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b(\u0010 J\u0015\u0010)\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b)\u0010 J\u0013\u0010(\u001a\u00020\u0013*\u00028\u0001H\u0016¢\u0006\u0004\b(\u0010\u0015J\u0013\u0010)\u001a\u00020\u0013*\u00028\u0001H\u0016¢\u0006\u0004\b)\u0010\u0015R,\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010*¨\u0006,"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/base/ViewBindingDelegateAdapter;", "", "T", "La6/iobyxmoadg;", "V", "Lmodern/payments/ecomAndroid/presentation/base/DelegateAdapter;", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "viewBindingInflater", "<init>", "(Ltg/vdvldrhtss;)V", "parent", "", "viewType", "Landroidx/recyclerview/widget/RecyclerView$iozdgvuglv;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$iozdgvuglv;", "Lgg/wwaezpbzkn;", "onCreated", "(La6/iobyxmoadg;)V", "holder", "", "items", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$iozdgvuglv;Ljava/util/List;I)V", "item", "onBind", "(La6/iobyxmoadg;Ljava/lang/Object;)V", "onRecycled", "(Landroidx/recyclerview/widget/RecyclerView$iozdgvuglv;)V", "isForViewType", "(Ljava/lang/Object;)Z", "getItemId", "(Ljava/lang/Object;)Ljava/lang/Object;", "itemContent", "itemId", "(Ljava/util/List;I)Z", "onAttachedToWindow", "onDetachedFromWindow", "Ltg/vdvldrhtss;", "ViewBindingHolder", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ViewBindingDelegateAdapter<T, V extends a6.iobyxmoadg> implements DelegateAdapter {
    private final vdvldrhtss viewBindingInflater;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/base/ViewBindingDelegateAdapter$ViewBindingHolder;", "La6/iobyxmoadg;", "V", "Landroidx/recyclerview/widget/RecyclerView$iozdgvuglv;", "viewBinding", "<init>", "(La6/iobyxmoadg;)V", "La6/iobyxmoadg;", "getViewBinding", "()La6/iobyxmoadg;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class ViewBindingHolder<V extends a6.iobyxmoadg> extends RecyclerView.iozdgvuglv {
        private final V viewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewBindingHolder(V viewBinding) {
            super(viewBinding.getRoot());
            zdlpuopuiu.btonecajqb(viewBinding, "viewBinding");
            this.viewBinding = viewBinding;
        }

        public final V getViewBinding() {
            return this.viewBinding;
        }
    }

    public ViewBindingDelegateAdapter(vdvldrhtss viewBindingInflater) {
        zdlpuopuiu.btonecajqb(viewBindingInflater, "viewBindingInflater");
        this.viewBindingInflater = viewBindingInflater;
    }

    public abstract Object getItemId(T t13);

    public abstract boolean isForViewType(Object item);

    @Override // modern.payments.ecomAndroid.presentation.base.DelegateAdapter
    public boolean isForViewType(List<? extends Object> items, int position) {
        zdlpuopuiu.btonecajqb(items, "items");
        return isForViewType(items.get(position));
    }

    @Override // modern.payments.ecomAndroid.presentation.base.DelegateAdapter
    public Object itemContent(Object item) {
        zdlpuopuiu.btonecajqb(item, "item");
        return item;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // modern.payments.ecomAndroid.presentation.base.DelegateAdapter
    public final Object itemId(Object item) {
        zdlpuopuiu.btonecajqb(item, "item");
        return getItemId(item);
    }

    public void onAttachedToWindow(V v13) {
        zdlpuopuiu.btonecajqb(v13, "<this>");
    }

    public abstract void onBind(V v13, T t13);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // modern.payments.ecomAndroid.presentation.base.DelegateAdapter
    public final void onBindViewHolder(RecyclerView.iozdgvuglv holder, List<? extends Object> items, int position) {
        zdlpuopuiu.btonecajqb(holder, "holder");
        zdlpuopuiu.btonecajqb(items, "items");
        a6.iobyxmoadg viewBinding = ((ViewBindingHolder) holder).getViewBinding();
        Object obj = items.get(position);
        zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type T of modern.payments.ecomAndroid.presentation.base.ViewBindingDelegateAdapter");
        onBind(viewBinding, obj);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.DelegateAdapter
    public final RecyclerView.iozdgvuglv onCreateViewHolder(ViewGroup parent, int viewType) {
        zdlpuopuiu.btonecajqb(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        vdvldrhtss vdvldrhtssVar = this.viewBindingInflater;
        zdlpuopuiu.lqeggnwhkg(layoutInflaterFrom);
        a6.iobyxmoadg iobyxmoadgVar = (a6.iobyxmoadg) vdvldrhtssVar.invoke(layoutInflaterFrom, parent, Boolean.FALSE);
        onCreated(iobyxmoadgVar);
        return new ViewBindingHolder(iobyxmoadgVar);
    }

    public void onCreated(V v13) {
        zdlpuopuiu.btonecajqb(v13, "<this>");
    }

    public void onDetachedFromWindow(V v13) {
        zdlpuopuiu.btonecajqb(v13, "<this>");
    }

    public void onRecycled(V v13) {
        zdlpuopuiu.btonecajqb(v13, "<this>");
    }

    @Override // modern.payments.ecomAndroid.presentation.base.DelegateAdapter
    public final void onAttachedToWindow(RecyclerView.iozdgvuglv holder) {
        zdlpuopuiu.btonecajqb(holder, "holder");
        onAttachedToWindow(((ViewBindingHolder) holder).getViewBinding());
    }

    @Override // modern.payments.ecomAndroid.presentation.base.DelegateAdapter
    public final void onDetachedFromWindow(RecyclerView.iozdgvuglv holder) {
        zdlpuopuiu.btonecajqb(holder, "holder");
        onDetachedFromWindow(((ViewBindingHolder) holder).getViewBinding());
    }

    @Override // modern.payments.ecomAndroid.presentation.base.DelegateAdapter
    public void onRecycled(RecyclerView.iozdgvuglv holder) {
        zdlpuopuiu.btonecajqb(holder, "holder");
        onRecycled(((ViewBindingHolder) holder).getViewBinding());
    }
}
