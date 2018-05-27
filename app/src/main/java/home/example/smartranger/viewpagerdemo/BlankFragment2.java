package home.example.smartranger.viewpagerdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BlankFragment2 extends Fragment {

    private final String mName = "F2";

    public BlankFragment2() {

    }

    public static BlankFragment2 newInstance() {
        return new BlankFragment2();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("MyDebug", mName + " onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_blank, container, false);

        TextView textView = root.findViewById(R.id.tv_name);
        textView.setText(mName);

        Log.d("MyDebug", mName + " onCreateView");

        return root;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        Log.d("MyDebug", mName + " setUserVisibleHint" + ":" + isVisibleToUser);
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("MyDebug", mName + " onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("MyDebug", mName + " onPause");
    }
}
