package modern.payments.ecomAndroid.presentation.base;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\f\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\f\u001a\u00020\u0004H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0001H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0001H&¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\u0019\u0010\u0011J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\u001a\u0010\u0011¨\u0006\u001b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/base/DelegateAdapter;", "", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Landroidx/recyclerview/widget/RecyclerView$iozdgvuglv;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$iozdgvuglv;", "holder", "", "items", "position", "Lgg/wwaezpbzkn;", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$iozdgvuglv;Ljava/util/List;I)V", "onRecycled", "(Landroidx/recyclerview/widget/RecyclerView$iozdgvuglv;)V", "", "isForViewType", "(Ljava/util/List;I)Z", "item", "itemId", "(Ljava/lang/Object;)Ljava/lang/Object;", "itemContent", "onAttachedToWindow", "onDetachedFromWindow", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface DelegateAdapter {
    boolean isForViewType(List<? extends Object> items, int position);

    Object itemContent(Object item);

    Object itemId(Object item);

    void onAttachedToWindow(RecyclerView.iozdgvuglv holder);

    void onBindViewHolder(RecyclerView.iozdgvuglv holder, List<? extends Object> items, int position);

    RecyclerView.iozdgvuglv onCreateViewHolder(ViewGroup parent, int viewType);

    void onDetachedFromWindow(RecyclerView.iozdgvuglv holder);

    void onRecycled(RecyclerView.iozdgvuglv holder);
}
