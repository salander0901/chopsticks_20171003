package com.example.fang.chopsticks.fragment;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fang.chopsticks.Config;
import com.example.fang.chopsticks.R;
import com.example.fang.chopsticks.RequestHandler;
import com.example.fang.chopsticks.tab.BaseFragment;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by FANG on 2017/5/16.
 */

public class FirstStepFragment extends BaseFragment{

    private static final String DATA_NAME = "name";
    private String title = "";
    private String JSON_STRING;
    private String JSON_STRING2;
    private String JSON_STRING3;
    private ImageView[] img;
    private TextView[] progress;
    private Button start_connected;
    private Handler handler = new Handler();


    public static FirstStepFragment newInstance(String title, int indicatorColor, int dividerColor) {

        FirstStepFragment f = new FirstStepFragment();
        f.setTitle(title);
        f.setIndicatorColor(indicatorColor);
        f.setDividerColor(dividerColor);

        //pass data
        Bundle args = new Bundle();
        args.putString(DATA_NAME, title);
        f.setArguments(args);

        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //get data
        title = getArguments().getString(DATA_NAME);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frg_first, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        start_connected = (Button)view.findViewById(R.id.button_start);
        ImageView img_x1_y1 = (ImageView)view.findViewById(R.id.img_x1_y1_1);
        ImageView img_x1_y2 = (ImageView)view.findViewById(R.id.img_x1_y2_1);
        ImageView img_x1_y3 = (ImageView)view.findViewById(R.id.img_x1_y3_1);
        ImageView img_x1_y4 = (ImageView)view.findViewById(R.id.img_x1_y4_1);
        ImageView img_x1_y5 = (ImageView)view.findViewById(R.id.img_x1_y5_1);
        ImageView img_x1_y6 = (ImageView)view.findViewById(R.id.img_x1_y6_1);
        ImageView img_x1_y7 = (ImageView)view.findViewById(R.id.img_x1_y7_1);
        ImageView img_x1_y8 = (ImageView)view.findViewById(R.id.img_x1_y8_1);
        ImageView img_x1_y9 = (ImageView)view.findViewById(R.id.img_x1_y9_1);
        ImageView img_x1_y10 = (ImageView)view.findViewById(R.id.img_x1_y10_1);
        ImageView img_x1_y11 = (ImageView)view.findViewById(R.id.img_x1_y11_1);
        ImageView img_x1_y12 = (ImageView)view.findViewById(R.id.img_x1_y12_1);
        ImageView img_x2_y1 = (ImageView)view.findViewById(R.id.img_x2_y1_1);
        ImageView img_x2_y2 = (ImageView)view.findViewById(R.id.img_x2_y2_1);
        ImageView img_x2_y3 = (ImageView)view.findViewById(R.id.img_x2_y3_1);
        ImageView img_x2_y4 = (ImageView)view.findViewById(R.id.img_x2_y4_1);
        ImageView img_x2_y5 = (ImageView)view.findViewById(R.id.img_x2_y5_1);
        ImageView img_x2_y6 = (ImageView)view.findViewById(R.id.img_x2_y6_1);
        ImageView img_x2_y7 = (ImageView)view.findViewById(R.id.img_x2_y7_1);
        ImageView img_x2_y8 = (ImageView)view.findViewById(R.id.img_x2_y8_1);
        ImageView img_x2_y9 = (ImageView)view.findViewById(R.id.img_x2_y9_1);
        ImageView img_x2_y10 = (ImageView)view.findViewById(R.id.img_x2_y10_1);
        ImageView img_x2_y11 = (ImageView)view.findViewById(R.id.img_x2_y11_1);
        ImageView img_x2_y12 = (ImageView)view.findViewById(R.id.img_x2_y12_1);
        ImageView img_x3_y1 = (ImageView)view.findViewById(R.id.img_x3_y1_1);
        ImageView img_x3_y2 = (ImageView)view.findViewById(R.id.img_x3_y2_1);
        ImageView img_x3_y3 = (ImageView)view.findViewById(R.id.img_x3_y3_1);
        ImageView img_x3_y4 = (ImageView)view.findViewById(R.id.img_x3_y4_1);
        ImageView img_x3_y5 = (ImageView)view.findViewById(R.id.img_x3_y5_1);
        ImageView img_x3_y6 = (ImageView)view.findViewById(R.id.img_x3_y6_1);
        ImageView img_x3_y7 = (ImageView)view.findViewById(R.id.img_x3_y7_1);
        ImageView img_x3_y8 = (ImageView)view.findViewById(R.id.img_x3_y8_1);
        ImageView img_x3_y9 = (ImageView)view.findViewById(R.id.img_x3_y9_1);
        ImageView img_x3_y10 = (ImageView)view.findViewById(R.id.img_x3_y10_1);
        ImageView img_x3_y11 = (ImageView)view.findViewById(R.id.img_x3_y11_1);
        ImageView img_x3_y12 = (ImageView)view.findViewById(R.id.img_x3_y12_1);
        ImageView img_x4_y1 = (ImageView)view.findViewById(R.id.img_x4_y1_1);
        ImageView img_x4_y2 = (ImageView)view.findViewById(R.id.img_x4_y2_1);
        ImageView img_x4_y3 = (ImageView)view.findViewById(R.id.img_x4_y3_1);
        ImageView img_x4_y4 = (ImageView)view.findViewById(R.id.img_x4_y4_1);
        ImageView img_x4_y5 = (ImageView)view.findViewById(R.id.img_x4_y5_1);
        ImageView img_x4_y6 = (ImageView)view.findViewById(R.id.img_x4_y6_1);
        ImageView img_x4_y7 = (ImageView)view.findViewById(R.id.img_x4_y7_1);
        ImageView img_x4_y8 = (ImageView)view.findViewById(R.id.img_x4_y8_1);
        ImageView img_x4_y9 = (ImageView)view.findViewById(R.id.img_x4_y9_1);
        ImageView img_x4_y10 = (ImageView)view.findViewById(R.id.img_x4_y10_1);
        ImageView img_x4_y11 = (ImageView)view.findViewById(R.id.img_x4_y11_1);
        ImageView img_x4_y12 = (ImageView)view.findViewById(R.id.img_x4_y12_1);
        ImageView img_x5_y1 = (ImageView)view.findViewById(R.id.img_x5_y1_1);
        ImageView img_x5_y2 = (ImageView)view.findViewById(R.id.img_x5_y2_1);
        ImageView img_x5_y3 = (ImageView)view.findViewById(R.id.img_x5_y3_1);
        ImageView img_x5_y4 = (ImageView)view.findViewById(R.id.img_x5_y4_1);
        ImageView img_x5_y5 = (ImageView)view.findViewById(R.id.img_x5_y5_1);
        ImageView img_x5_y6 = (ImageView)view.findViewById(R.id.img_x5_y6_1);
        ImageView img_x5_y7 = (ImageView)view.findViewById(R.id.img_x5_y7_1);
        ImageView img_x5_y8 = (ImageView)view.findViewById(R.id.img_x5_y8_1);
        ImageView img_x5_y9 = (ImageView)view.findViewById(R.id.img_x5_y9_1);
        ImageView img_x5_y10 = (ImageView)view.findViewById(R.id.img_x5_y10_1);
        ImageView img_x5_y11 = (ImageView)view.findViewById(R.id.img_x5_y11_1);
        ImageView img_x5_y12 = (ImageView)view.findViewById(R.id.img_x5_y12_1);
        ImageView img_x6_y1 = (ImageView)view.findViewById(R.id.img_x6_y1_1);
        ImageView img_x6_y2 = (ImageView)view.findViewById(R.id.img_x6_y2_1);
        ImageView img_x6_y3 = (ImageView)view.findViewById(R.id.img_x6_y3_1);
        ImageView img_x6_y4 = (ImageView)view.findViewById(R.id.img_x6_y4_1);
        ImageView img_x6_y5 = (ImageView)view.findViewById(R.id.img_x6_y5_1);
        ImageView img_x6_y6 = (ImageView)view.findViewById(R.id.img_x6_y6_1);
        ImageView img_x6_y7 = (ImageView)view.findViewById(R.id.img_x6_y7_1);
        ImageView img_x6_y8 = (ImageView)view.findViewById(R.id.img_x6_y8_1);
        ImageView img_x6_y9 = (ImageView)view.findViewById(R.id.img_x6_y9_1);
        ImageView img_x6_y10 = (ImageView)view.findViewById(R.id.img_x6_y10_1);
        ImageView img_x6_y11 = (ImageView)view.findViewById(R.id.img_x6_y11_1);
        ImageView img_x6_y12 = (ImageView)view.findViewById(R.id.img_x6_y12_1);
        ImageView img_x7_y1 = (ImageView)view.findViewById(R.id.img_x7_y1_1);
        ImageView img_x7_y2 = (ImageView)view.findViewById(R.id.img_x7_y2_1);
        ImageView img_x7_y3 = (ImageView)view.findViewById(R.id.img_x7_y3_1);
        ImageView img_x7_y4 = (ImageView)view.findViewById(R.id.img_x7_y4_1);
        ImageView img_x7_y5 = (ImageView)view.findViewById(R.id.img_x7_y5_1);
        ImageView img_x7_y6 = (ImageView)view.findViewById(R.id.img_x7_y6_1);
        ImageView img_x7_y7 = (ImageView)view.findViewById(R.id.img_x7_y7_1);
        ImageView img_x7_y8 = (ImageView)view.findViewById(R.id.img_x7_y8_1);
        ImageView img_x7_y9 = (ImageView)view.findViewById(R.id.img_x7_y9_1);
        ImageView img_x7_y10 = (ImageView)view.findViewById(R.id.img_x7_y10_1);
        ImageView img_x7_y11 = (ImageView)view.findViewById(R.id.img_x7_y11_1);
        ImageView img_x7_y12 = (ImageView)view.findViewById(R.id.img_x7_y12_1);
        ImageView img_x8_y1 = (ImageView)view.findViewById(R.id.img_x8_y1_1);
        ImageView img_x8_y2 = (ImageView)view.findViewById(R.id.img_x8_y2_1);
        ImageView img_x8_y3 = (ImageView)view.findViewById(R.id.img_x8_y3_1);
        ImageView img_x8_y4 = (ImageView)view.findViewById(R.id.img_x8_y4_1);
        ImageView img_x8_y5 = (ImageView)view.findViewById(R.id.img_x8_y5_1);
        ImageView img_x8_y6 = (ImageView)view.findViewById(R.id.img_x8_y6_1);
        ImageView img_x8_y7 = (ImageView)view.findViewById(R.id.img_x8_y7_1);
        ImageView img_x8_y8 = (ImageView)view.findViewById(R.id.img_x8_y8_1);
        ImageView img_x8_y9 = (ImageView)view.findViewById(R.id.img_x8_y9_1);
        ImageView img_x8_y10 = (ImageView)view.findViewById(R.id.img_x8_y10_1);
        ImageView img_x8_y11 = (ImageView)view.findViewById(R.id.img_x8_y11_1);
        ImageView img_x8_y12 = (ImageView)view.findViewById(R.id.img_x8_y12_1);
        ImageView img_x9_y1 = (ImageView)view.findViewById(R.id.img_x9_y1_1);
        ImageView img_x9_y2 = (ImageView)view.findViewById(R.id.img_x9_y2_1);
        ImageView img_x9_y3 = (ImageView)view.findViewById(R.id.img_x9_y3_1);
        ImageView img_x9_y4 = (ImageView)view.findViewById(R.id.img_x9_y4_1);
        ImageView img_x9_y5 = (ImageView)view.findViewById(R.id.img_x9_y5_1);
        ImageView img_x9_y6 = (ImageView)view.findViewById(R.id.img_x9_y6_1);
        ImageView img_x9_y7 = (ImageView)view.findViewById(R.id.img_x9_y7_1);
        ImageView img_x9_y8 = (ImageView)view.findViewById(R.id.img_x9_y8_1);
        ImageView img_x9_y9 = (ImageView)view.findViewById(R.id.img_x9_y9_1);
        ImageView img_x9_y10 = (ImageView)view.findViewById(R.id.img_x9_y10_1);
        ImageView img_x9_y11 = (ImageView)view.findViewById(R.id.img_x9_y11_1);
        ImageView img_x9_y12 = (ImageView)view.findViewById(R.id.img_x9_y12_1);
        ImageView img_x10_y1 = (ImageView)view.findViewById(R.id.img_x10_y1_1);
        ImageView img_x10_y2 = (ImageView)view.findViewById(R.id.img_x10_y2_1);
        ImageView img_x10_y3 = (ImageView)view.findViewById(R.id.img_x10_y3_1);
        ImageView img_x10_y4 = (ImageView)view.findViewById(R.id.img_x10_y4_1);
        ImageView img_x10_y5 = (ImageView)view.findViewById(R.id.img_x10_y5_1);
        ImageView img_x10_y6 = (ImageView)view.findViewById(R.id.img_x10_y6_1);
        ImageView img_x10_y7 = (ImageView)view.findViewById(R.id.img_x10_y7_1);
        ImageView img_x10_y8 = (ImageView)view.findViewById(R.id.img_x10_y8_1);
        ImageView img_x10_y9 = (ImageView)view.findViewById(R.id.img_x10_y9_1);
        ImageView img_x10_y10 = (ImageView)view.findViewById(R.id.img_x10_y10_1);
        ImageView img_x10_y11 = (ImageView)view.findViewById(R.id.img_x10_y11_1);
        ImageView img_x10_y12 = (ImageView)view.findViewById(R.id.img_x10_y12_1);
        ImageView img_x11_y1 = (ImageView)view.findViewById(R.id.img_x11_y1_1);
        ImageView img_x11_y2 = (ImageView)view.findViewById(R.id.img_x11_y2_1);
        ImageView img_x11_y3 = (ImageView)view.findViewById(R.id.img_x11_y3_1);
        ImageView img_x11_y4 = (ImageView)view.findViewById(R.id.img_x11_y4_1);
        ImageView img_x11_y5 = (ImageView)view.findViewById(R.id.img_x11_y5_1);
        ImageView img_x11_y6 = (ImageView)view.findViewById(R.id.img_x11_y6_1);
        ImageView img_x11_y7 = (ImageView)view.findViewById(R.id.img_x11_y7_1);
        ImageView img_x11_y8 = (ImageView)view.findViewById(R.id.img_x11_y8_1);
        ImageView img_x11_y9 = (ImageView)view.findViewById(R.id.img_x11_y9_1);
        ImageView img_x11_y10 = (ImageView)view.findViewById(R.id.img_x11_y10_1);
        ImageView img_x11_y11 = (ImageView)view.findViewById(R.id.img_x11_y11_1);
        ImageView img_x11_y12 = (ImageView)view.findViewById(R.id.img_x11_y12_1);
        ImageView img_x12_y1 = (ImageView)view.findViewById(R.id.img_x12_y1_1);
        ImageView img_x12_y2 = (ImageView)view.findViewById(R.id.img_x12_y2_1);
        ImageView img_x12_y3 = (ImageView)view.findViewById(R.id.img_x12_y3_1);
        ImageView img_x12_y4 = (ImageView)view.findViewById(R.id.img_x12_y4_1);
        ImageView img_x12_y5 = (ImageView)view.findViewById(R.id.img_x12_y5_1);
        ImageView img_x12_y6 = (ImageView)view.findViewById(R.id.img_x12_y6_1);
        ImageView img_x12_y7 = (ImageView)view.findViewById(R.id.img_x12_y7_1);
        ImageView img_x12_y8 = (ImageView)view.findViewById(R.id.img_x12_y8_1);
        ImageView img_x12_y9 = (ImageView)view.findViewById(R.id.img_x12_y9_1);
        ImageView img_x12_y10 = (ImageView)view.findViewById(R.id.img_x12_y10_1);
        ImageView img_x12_y11 = (ImageView)view.findViewById(R.id.img_x12_y11_1);
        ImageView img_x12_y12 = (ImageView)view.findViewById(R.id.img_x12_y12_1);
        TextView progress1 = (TextView)view.findViewById(R.id.txt_first_progress1);
        TextView progress2 = (TextView)view.findViewById(R.id.txt_first_progress2);
        TextView progress3 = (TextView)view.findViewById(R.id.txt_first_progress3);
        TextView rfid = (TextView)view.findViewById(R.id.txt_first_rfid);
        TextView station = (TextView)view.findViewById(R.id.txt_station);
        img = new ImageView[]{img_x1_y1, img_x1_y2, img_x1_y3, img_x1_y4, img_x1_y5, img_x1_y6, img_x1_y7, img_x1_y8, img_x1_y9, img_x1_y10, img_x1_y11, img_x1_y12,
                img_x2_y1, img_x2_y2, img_x2_y3, img_x2_y4, img_x2_y5, img_x2_y6, img_x2_y7, img_x2_y8, img_x2_y9, img_x2_y10, img_x2_y11, img_x2_y12,
                img_x3_y1, img_x3_y2, img_x3_y3, img_x3_y4, img_x3_y5, img_x3_y6, img_x3_y7, img_x3_y8, img_x3_y9, img_x3_y10, img_x3_y11, img_x3_y12,
                img_x4_y1, img_x4_y2, img_x4_y3, img_x4_y4, img_x4_y5, img_x4_y6, img_x4_y7, img_x4_y8, img_x4_y9, img_x4_y10, img_x4_y11, img_x4_y12,
                img_x5_y1, img_x5_y2, img_x5_y3, img_x5_y4, img_x5_y5, img_x5_y6, img_x5_y7, img_x5_y8, img_x5_y9, img_x5_y10, img_x5_y11, img_x5_y12,
                img_x6_y1, img_x6_y2, img_x6_y3, img_x6_y4, img_x6_y5, img_x6_y6, img_x6_y7, img_x6_y8, img_x6_y9, img_x6_y10, img_x6_y11, img_x6_y12,
                img_x7_y1, img_x7_y2, img_x7_y3, img_x7_y4, img_x7_y5, img_x7_y6, img_x7_y7, img_x7_y8, img_x7_y9, img_x7_y10, img_x7_y11, img_x7_y12,
                img_x8_y1, img_x8_y2, img_x8_y3, img_x8_y4, img_x8_y5, img_x8_y6, img_x8_y7, img_x8_y8, img_x8_y9, img_x8_y10, img_x8_y11, img_x8_y12,
                img_x9_y1, img_x9_y2, img_x9_y3, img_x9_y4, img_x9_y5, img_x9_y6, img_x9_y7, img_x9_y8, img_x9_y9, img_x9_y10, img_x9_y11, img_x9_y12,
                img_x10_y1, img_x10_y2, img_x10_y3, img_x10_y4, img_x10_y5, img_x10_y6, img_x10_y7, img_x10_y8, img_x10_y9, img_x10_y10, img_x10_y11, img_x10_y12,
                img_x11_y1, img_x11_y2, img_x11_y3, img_x11_y4, img_x11_y5, img_x11_y6, img_x11_y7, img_x11_y8, img_x11_y9, img_x11_y10, img_x11_y11, img_x11_y12,
                img_x12_y1, img_x12_y2, img_x12_y3, img_x12_y4, img_x12_y5, img_x12_y6, img_x12_y7, img_x12_y8, img_x12_y9, img_x12_y10, img_x12_y11, img_x12_y12};
        progress = new TextView[]{progress1,progress2,progress3,rfid,station};
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
        start_connected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(update, 10);
                start_connected.setEnabled(false);
            }
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        handler.removeCallbacks(update);
    }

    private Runnable update = new Runnable() {
        public void run() {
            getStation();
            handler.postDelayed(this, 1000);
        }
    };
    private void getStation() {
        class GetJSON extends AsyncTask<Void, Void, String> {
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                //loading = ProgressDialog.show(MainActivity.this, "Fetching Data", "Wait...", false, false);
            }
            /*背景執行獲取字串*/
            @Override
            protected String doInBackground(Void... params) {
                RequestHandler rh = new RequestHandler();
                String s = rh.sendGetRequest(Config.URL_LOCATION);
                return s;
            }
            /*獲得字串之後呼叫更新圖片的function*/
            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                JSON_STRING = s;
                showProgress();
            }
        }
        GetJSON gj = new GetJSON();
        gj.execute();
    }


    private void showProgress() {
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(JSON_STRING);
            JSONArray result = jsonObject.getJSONArray(Config.TAG_JSON_ARRAY1);
            int state[] = new int[144];
            
            int i;
            int step1=0;
            int step2=0;
            int step3=0;
            /*將回傳的JSON字串丟至矩陣+換圖*/
            for(i=0;i<=143;i++)
            {
                JSONObject jo = result.getJSONObject(i);
                state[i] = Integer.parseInt(jo.getString(Config.xy[i]));
                img[i].setImageResource(R.drawable.change);
                img[i].setImageLevel(state[i]);
                if( i==0 && state[i]==0)
                {
                    Toast.makeText(getActivity(), "請開啟光學儀器檢測", Toast.LENGTH_SHORT).show();
                    handler.removeCallbacks(update);
                    start_connected.setEnabled(true);
                }
                if(state[i] <5 && state[i] >=1 ) step1++;
                if(state[i] ==6 ) step2++;
                if(state[i] ==7 ) step3++;

            }
            JSONObject jo = result.getJSONObject(144);
            String rfid = jo.getString(Config.RFID);
            jo = result.getJSONObject(145);
            String station =  Integer.toString(Integer.parseInt(jo.getString(Config.STATION))/10);
            progress[0].setText("進料進度："+step1+"/144");
            progress[1].setText("倒角進度："+step2+"/144");
            progress[2].setText("上膠進度："+step3+"/144");
            progress[3].setText("RFID : "+rfid);
            progress[4].setText("站別 : "+station);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }



}


