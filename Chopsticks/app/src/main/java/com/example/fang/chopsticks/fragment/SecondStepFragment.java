package com.example.fang.chopsticks.fragment;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

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

public class SecondStepFragment extends BaseFragment {
    private static final String DATA_NAME = "name";

    private String title = "";
    private String JSON_STRING;
    private String JSON_STRING1;
    private String JSON_STRING3;
    private ImageView[] img;
    private TextView[] progress;
    private Handler handler = new Handler();

    public static SecondStepFragment newInstance(String title, int indicatorColor, int dividerColor) {

        SecondStepFragment f = new SecondStepFragment();
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
        return inflater.inflate(R.layout.frg_second, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView img_x1_y1 = (ImageView)view.findViewById(R.id.img_x1_y1_2);
        ImageView img_x1_y2 = (ImageView)view.findViewById(R.id.img_x1_y2_2);
        ImageView img_x1_y3 = (ImageView)view.findViewById(R.id.img_x1_y3_2);
        ImageView img_x1_y4 = (ImageView)view.findViewById(R.id.img_x1_y4_2);
        ImageView img_x1_y5 = (ImageView)view.findViewById(R.id.img_x1_y5_2);
        ImageView img_x1_y6 = (ImageView)view.findViewById(R.id.img_x1_y6_2);
        ImageView img_x1_y7 = (ImageView)view.findViewById(R.id.img_x1_y7_2);
        ImageView img_x1_y8 = (ImageView)view.findViewById(R.id.img_x1_y8_2);
        ImageView img_x1_y9 = (ImageView)view.findViewById(R.id.img_x1_y9_2);
        ImageView img_x1_y10 = (ImageView)view.findViewById(R.id.img_x1_y10_2);
        ImageView img_x1_y11 = (ImageView)view.findViewById(R.id.img_x1_y11_2);
        ImageView img_x1_y12 = (ImageView)view.findViewById(R.id.img_x1_y12_2);
        ImageView img_x2_y1 = (ImageView)view.findViewById(R.id.img_x2_y1_2);
        ImageView img_x2_y2 = (ImageView)view.findViewById(R.id.img_x2_y2_2);
        ImageView img_x2_y3 = (ImageView)view.findViewById(R.id.img_x2_y3_2);
        ImageView img_x2_y4 = (ImageView)view.findViewById(R.id.img_x2_y4_2);
        ImageView img_x2_y5 = (ImageView)view.findViewById(R.id.img_x2_y5_2);
        ImageView img_x2_y6 = (ImageView)view.findViewById(R.id.img_x2_y6_2);
        ImageView img_x2_y7 = (ImageView)view.findViewById(R.id.img_x2_y7_2);
        ImageView img_x2_y8 = (ImageView)view.findViewById(R.id.img_x2_y8_2);
        ImageView img_x2_y9 = (ImageView)view.findViewById(R.id.img_x2_y9_2);
        ImageView img_x2_y10 = (ImageView)view.findViewById(R.id.img_x2_y10_2);
        ImageView img_x2_y11 = (ImageView)view.findViewById(R.id.img_x2_y11_2);
        ImageView img_x2_y12 = (ImageView)view.findViewById(R.id.img_x2_y12_2);
        ImageView img_x3_y1 = (ImageView)view.findViewById(R.id.img_x3_y1_2);
        ImageView img_x3_y2 = (ImageView)view.findViewById(R.id.img_x3_y2_2);
        ImageView img_x3_y3 = (ImageView)view.findViewById(R.id.img_x3_y3_2);
        ImageView img_x3_y4 = (ImageView)view.findViewById(R.id.img_x3_y4_2);
        ImageView img_x3_y5 = (ImageView)view.findViewById(R.id.img_x3_y5_2);
        ImageView img_x3_y6 = (ImageView)view.findViewById(R.id.img_x3_y6_2);
        ImageView img_x3_y7 = (ImageView)view.findViewById(R.id.img_x3_y7_2);
        ImageView img_x3_y8 = (ImageView)view.findViewById(R.id.img_x3_y8_2);
        ImageView img_x3_y9 = (ImageView)view.findViewById(R.id.img_x3_y9_2);
        ImageView img_x3_y10 = (ImageView)view.findViewById(R.id.img_x3_y10_2);
        ImageView img_x3_y11 = (ImageView)view.findViewById(R.id.img_x3_y11_2);
        ImageView img_x3_y12 = (ImageView)view.findViewById(R.id.img_x3_y12_2);
        ImageView img_x4_y1 = (ImageView)view.findViewById(R.id.img_x4_y1_2);
        ImageView img_x4_y2 = (ImageView)view.findViewById(R.id.img_x4_y2_2);
        ImageView img_x4_y3 = (ImageView)view.findViewById(R.id.img_x4_y3_2);
        ImageView img_x4_y4 = (ImageView)view.findViewById(R.id.img_x4_y4_2);
        ImageView img_x4_y5 = (ImageView)view.findViewById(R.id.img_x4_y5_2);
        ImageView img_x4_y6 = (ImageView)view.findViewById(R.id.img_x4_y6_2);
        ImageView img_x4_y7 = (ImageView)view.findViewById(R.id.img_x4_y7_2);
        ImageView img_x4_y8 = (ImageView)view.findViewById(R.id.img_x4_y8_2);
        ImageView img_x4_y9 = (ImageView)view.findViewById(R.id.img_x4_y9_2);
        ImageView img_x4_y10 = (ImageView)view.findViewById(R.id.img_x4_y10_2);
        ImageView img_x4_y11 = (ImageView)view.findViewById(R.id.img_x4_y11_2);
        ImageView img_x4_y12 = (ImageView)view.findViewById(R.id.img_x4_y12_2);
        ImageView img_x5_y1 = (ImageView)view.findViewById(R.id.img_x5_y1_2);
        ImageView img_x5_y2 = (ImageView)view.findViewById(R.id.img_x5_y2_2);
        ImageView img_x5_y3 = (ImageView)view.findViewById(R.id.img_x5_y3_2);
        ImageView img_x5_y4 = (ImageView)view.findViewById(R.id.img_x5_y4_2);
        ImageView img_x5_y5 = (ImageView)view.findViewById(R.id.img_x5_y5_2);
        ImageView img_x5_y6 = (ImageView)view.findViewById(R.id.img_x5_y6_2);
        ImageView img_x5_y7 = (ImageView)view.findViewById(R.id.img_x5_y7_2);
        ImageView img_x5_y8 = (ImageView)view.findViewById(R.id.img_x5_y8_2);
        ImageView img_x5_y9 = (ImageView)view.findViewById(R.id.img_x5_y9_2);
        ImageView img_x5_y10 = (ImageView)view.findViewById(R.id.img_x5_y10_2);
        ImageView img_x5_y11 = (ImageView)view.findViewById(R.id.img_x5_y11_2);
        ImageView img_x5_y12 = (ImageView)view.findViewById(R.id.img_x5_y12_2);
        ImageView img_x6_y1 = (ImageView)view.findViewById(R.id.img_x6_y1_2);
        ImageView img_x6_y2 = (ImageView)view.findViewById(R.id.img_x6_y2_2);
        ImageView img_x6_y3 = (ImageView)view.findViewById(R.id.img_x6_y3_2);
        ImageView img_x6_y4 = (ImageView)view.findViewById(R.id.img_x6_y4_2);
        ImageView img_x6_y5 = (ImageView)view.findViewById(R.id.img_x6_y5_2);
        ImageView img_x6_y6 = (ImageView)view.findViewById(R.id.img_x6_y6_2);
        ImageView img_x6_y7 = (ImageView)view.findViewById(R.id.img_x6_y7_2);
        ImageView img_x6_y8 = (ImageView)view.findViewById(R.id.img_x6_y8_2);
        ImageView img_x6_y9 = (ImageView)view.findViewById(R.id.img_x6_y9_2);
        ImageView img_x6_y10 = (ImageView)view.findViewById(R.id.img_x6_y10_2);
        ImageView img_x6_y11 = (ImageView)view.findViewById(R.id.img_x6_y11_2);
        ImageView img_x6_y12 = (ImageView)view.findViewById(R.id.img_x6_y12_2);
        ImageView img_x7_y1 = (ImageView)view.findViewById(R.id.img_x7_y1_2);
        ImageView img_x7_y2 = (ImageView)view.findViewById(R.id.img_x7_y2_2);
        ImageView img_x7_y3 = (ImageView)view.findViewById(R.id.img_x7_y3_2);
        ImageView img_x7_y4 = (ImageView)view.findViewById(R.id.img_x7_y4_2);
        ImageView img_x7_y5 = (ImageView)view.findViewById(R.id.img_x7_y5_2);
        ImageView img_x7_y6 = (ImageView)view.findViewById(R.id.img_x7_y6_2);
        ImageView img_x7_y7 = (ImageView)view.findViewById(R.id.img_x7_y7_2);
        ImageView img_x7_y8 = (ImageView)view.findViewById(R.id.img_x7_y8_2);
        ImageView img_x7_y9 = (ImageView)view.findViewById(R.id.img_x7_y9_2);
        ImageView img_x7_y10 = (ImageView)view.findViewById(R.id.img_x7_y10_2);
        ImageView img_x7_y11 = (ImageView)view.findViewById(R.id.img_x7_y11_2);
        ImageView img_x7_y12 = (ImageView)view.findViewById(R.id.img_x7_y12_2);
        ImageView img_x8_y1 = (ImageView)view.findViewById(R.id.img_x8_y1_2);
        ImageView img_x8_y2 = (ImageView)view.findViewById(R.id.img_x8_y2_2);
        ImageView img_x8_y3 = (ImageView)view.findViewById(R.id.img_x8_y3_2);
        ImageView img_x8_y4 = (ImageView)view.findViewById(R.id.img_x8_y4_2);
        ImageView img_x8_y5 = (ImageView)view.findViewById(R.id.img_x8_y5_2);
        ImageView img_x8_y6 = (ImageView)view.findViewById(R.id.img_x8_y6_2);
        ImageView img_x8_y7 = (ImageView)view.findViewById(R.id.img_x8_y7_2);
        ImageView img_x8_y8 = (ImageView)view.findViewById(R.id.img_x8_y8_2);
        ImageView img_x8_y9 = (ImageView)view.findViewById(R.id.img_x8_y9_2);
        ImageView img_x8_y10 = (ImageView)view.findViewById(R.id.img_x8_y10_2);
        ImageView img_x8_y11 = (ImageView)view.findViewById(R.id.img_x8_y11_2);
        ImageView img_x8_y12 = (ImageView)view.findViewById(R.id.img_x8_y12_2);
        ImageView img_x9_y1 = (ImageView)view.findViewById(R.id.img_x9_y1_2);
        ImageView img_x9_y2 = (ImageView)view.findViewById(R.id.img_x9_y2_2);
        ImageView img_x9_y3 = (ImageView)view.findViewById(R.id.img_x9_y3_2);
        ImageView img_x9_y4 = (ImageView)view.findViewById(R.id.img_x9_y4_2);
        ImageView img_x9_y5 = (ImageView)view.findViewById(R.id.img_x9_y5_2);
        ImageView img_x9_y6 = (ImageView)view.findViewById(R.id.img_x9_y6_2);
        ImageView img_x9_y7 = (ImageView)view.findViewById(R.id.img_x9_y7_2);
        ImageView img_x9_y8 = (ImageView)view.findViewById(R.id.img_x9_y8_2);
        ImageView img_x9_y9 = (ImageView)view.findViewById(R.id.img_x9_y9_2);
        ImageView img_x9_y10 = (ImageView)view.findViewById(R.id.img_x9_y10_2);
        ImageView img_x9_y11 = (ImageView)view.findViewById(R.id.img_x9_y11_2);
        ImageView img_x9_y12 = (ImageView)view.findViewById(R.id.img_x9_y12_2);
        ImageView img_x10_y1 = (ImageView)view.findViewById(R.id.img_x10_y1_2);
        ImageView img_x10_y2 = (ImageView)view.findViewById(R.id.img_x10_y2_2);
        ImageView img_x10_y3 = (ImageView)view.findViewById(R.id.img_x10_y3_2);
        ImageView img_x10_y4 = (ImageView)view.findViewById(R.id.img_x10_y4_2);
        ImageView img_x10_y5 = (ImageView)view.findViewById(R.id.img_x10_y5_2);
        ImageView img_x10_y6 = (ImageView)view.findViewById(R.id.img_x10_y6_2);
        ImageView img_x10_y7 = (ImageView)view.findViewById(R.id.img_x10_y7_2);
        ImageView img_x10_y8 = (ImageView)view.findViewById(R.id.img_x10_y8_2);
        ImageView img_x10_y9 = (ImageView)view.findViewById(R.id.img_x10_y9_2);
        ImageView img_x10_y10 = (ImageView)view.findViewById(R.id.img_x10_y10_2);
        ImageView img_x10_y11 = (ImageView)view.findViewById(R.id.img_x10_y11_2);
        ImageView img_x10_y12 = (ImageView)view.findViewById(R.id.img_x10_y12_2);
        ImageView img_x11_y1 = (ImageView)view.findViewById(R.id.img_x11_y1_2);
        ImageView img_x11_y2 = (ImageView)view.findViewById(R.id.img_x11_y2_2);
        ImageView img_x11_y3 = (ImageView)view.findViewById(R.id.img_x11_y3_2);
        ImageView img_x11_y4 = (ImageView)view.findViewById(R.id.img_x11_y4_2);
        ImageView img_x11_y5 = (ImageView)view.findViewById(R.id.img_x11_y5_2);
        ImageView img_x11_y6 = (ImageView)view.findViewById(R.id.img_x11_y6_2);
        ImageView img_x11_y7 = (ImageView)view.findViewById(R.id.img_x11_y7_2);
        ImageView img_x11_y8 = (ImageView)view.findViewById(R.id.img_x11_y8_2);
        ImageView img_x11_y9 = (ImageView)view.findViewById(R.id.img_x11_y9_2);
        ImageView img_x11_y10 = (ImageView)view.findViewById(R.id.img_x11_y10_2);
        ImageView img_x11_y11 = (ImageView)view.findViewById(R.id.img_x11_y11_2);
        ImageView img_x11_y12 = (ImageView)view.findViewById(R.id.img_x11_y12_2);
        ImageView img_x12_y1 = (ImageView)view.findViewById(R.id.img_x12_y1_2);
        ImageView img_x12_y2 = (ImageView)view.findViewById(R.id.img_x12_y2_2);
        ImageView img_x12_y3 = (ImageView)view.findViewById(R.id.img_x12_y3_2);
        ImageView img_x12_y4 = (ImageView)view.findViewById(R.id.img_x12_y4_2);
        ImageView img_x12_y5 = (ImageView)view.findViewById(R.id.img_x12_y5_2);
        ImageView img_x12_y6 = (ImageView)view.findViewById(R.id.img_x12_y6_2);
        ImageView img_x12_y7 = (ImageView)view.findViewById(R.id.img_x12_y7_2);
        ImageView img_x12_y8 = (ImageView)view.findViewById(R.id.img_x12_y8_2);
        ImageView img_x12_y9 = (ImageView)view.findViewById(R.id.img_x12_y9_2);
        ImageView img_x12_y10 = (ImageView)view.findViewById(R.id.img_x12_y10_2);
        ImageView img_x12_y11 = (ImageView)view.findViewById(R.id.img_x12_y11_2);
        ImageView img_x12_y12 = (ImageView)view.findViewById(R.id.img_x12_y12_2);
        TextView progress1 = (TextView)view.findViewById(R.id.txt_second_progress1);
        TextView progress2 = (TextView)view.findViewById(R.id.txt_second_progress2);
        TextView progress3 = (TextView)view.findViewById(R.id.txt_second_progress3);
        TextView rfid = (TextView)view.findViewById(R.id.txt_second_rfid);

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
        progress = new TextView[]{progress1,progress2,progress3,rfid};
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }
    @Override
    public void onStart() {
        super.onStart();
        handler.postDelayed(update, 10);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    private Runnable update = new Runnable() {
        public void run() {
            getJSON();
            getStation1();
            getStation3();
            handler.postDelayed(this, 1000);
        }
    };
    private void getJSON() {
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
                String s = rh.sendGetRequest(Config.URL_LOCATION2);
                return s;
            }
            /*獲得字串之後呼叫更新圖片的function*/
            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                JSON_STRING = s;
                showData();
            }
        }
        GetJSON gj = new GetJSON();
        gj.execute();
    }
    private void getStation1() {
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
                String s1 = rh.sendGetRequest(Config.URL_LOCATION1);
                return s1;
            }
            /*獲得字串之後呼叫更新圖片的function*/
            @Override
            protected void onPostExecute(String s1) {
                super.onPostExecute(s1);
                JSON_STRING1 = s1;
                showProgress1();
            }
        }
        GetJSON gj = new GetJSON();
        gj.execute();
    }
    private void getStation3() {
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
                String s3 = rh.sendGetRequest(Config.URL_LOCATION3);
                return s3;
            }
            /*獲得字串之後呼叫更新圖片的function*/
            @Override
            protected void onPostExecute(String s3) {
                super.onPostExecute(s3);
                JSON_STRING3 = s3;
                showProgress3();
            }
        }
        GetJSON gj = new GetJSON();
        gj.execute();
    }

    private void showData() {
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(JSON_STRING);
            JSONArray result = jsonObject.getJSONArray(Config.TAG_JSON_ARRAY2);
            int state[] = new int[144];

            int i;
            int step2=0;
            /*將回傳的JSON字串丟至int陣列+換圖*/
            for(i=0;i<=143;i++)
            {
                JSONObject jo = result.getJSONObject(i);
                state[i] = Integer.parseInt(jo.getString(Config.xy[i]));
                if(state[i] == 4) step2++;
                img[i].setImageResource(R.drawable.change);
                img[i].setImageLevel(state[i]);
            }
            JSONObject jo = result.getJSONObject(144);
            String rfid = jo.getString(Config.RFID);
            progress[3].setText("RFID : "+rfid);
            progress[1].setText("倒角進度："+step2+"/144");

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void showProgress1() {
        JSONObject jsonObject1 = null;
        try {
            jsonObject1 = new JSONObject(JSON_STRING1);
            JSONArray result1 = jsonObject1.getJSONArray(Config.TAG_JSON_ARRAY1);
            int state1[] = new int[144];
            int i;
            int step1=0;
            /*將回傳的JSON字串丟至int陣列+換圖*/
            for(i=0;i<=143;i++)
            {
                JSONObject jo = result1.getJSONObject(i);
                state1[i] = Integer.parseInt(jo.getString(Config.xy[i]));
                if(state1[i] == 1) step1++;
            }
            progress[0].setText("進料進度："+step1+"/144");

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void showProgress3() {
        JSONObject jsonObject3 = null;
        try {
            jsonObject3 = new JSONObject(JSON_STRING3);
            JSONArray result3 = jsonObject3.getJSONArray(Config.TAG_JSON_ARRAY3);
            int state3[] = new int[144];
            int i;
            int step3=0;
            /*將回傳的JSON字串丟至int陣列+換圖*/
            for(i=0;i<=143;i++)
            {
                JSONObject jo = result3.getJSONObject(i);
                state3[i] = Integer.parseInt(jo.getString(Config.xy[i]));
                if(state3[i] == 5) step3++;
            }
            progress[2].setText("上膠進度："+step3+"/144");

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
