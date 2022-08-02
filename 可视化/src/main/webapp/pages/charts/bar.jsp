<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <script type="text/javascript" src="/static/lib/jquery/1.9.1/jquery.min.js"></script>
    <script type="text/javascript" src="/static/h-ui/js/echarts.js" charset="UTF-8"></script>
</head>
<body>

<!-- 为echarts准备一个容器Dom div -->
<div id="main" style="width: 90%;height:430px;"></div>

<script type="text/javascript">
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('main'));

    $.ajax({
        type: "GET",
        url: "/charts/getLog1Data",
        dataType: 'json',
        //回调函数  data里边就是我们需要的数据
        success: function(data) {
            // 指定图表的配置项和数据
            var option = {
                //标题
                title: {
                    text: '用户歌曲点击量分布',
                    //跳转标签
                    link: "a.html",
                    //当前打开
                    target: 'self',
                    //修改文本样式
                    textStyle: {
                        color: '#5470C6',
                        fontSize: 20
                    },
                    //位置
                    left: 'right'
                },
                //提示框组件
                tooltip: {
                    formatter: '{a}<br/>{b}:{c}次'
                },
                //图例组件
                legend: {
                    data: ['点击量'],
                    icon: 'circle'
                },
                //x轴的值
                xAxis: {
                    axisLabel: {
                        interval: 0,
                        rotate:-15,
                        formatter:function(value)
                        {
                            return value.split("").join("");
                        }
                    },

                    //一定注意参数的类型对应上
                    //['衬衫', '羊毛衫', '雪纺衫', '裤子', '高跟鞋', '袜子']
                    data: data.names
                },
                //y轴的值    （折线图跟柱状图取默认值）
                yAxis: {

                },
                //核心配置  series
                series: [{
                    //名字
                    name: '销量',
                    //类型
                    type: 'bar',
                    //数据类型
                    //[5, 20, 36, 10, 10, 20]
                    data: data.values
                }]
            };
            // 使用刚指定的配置项和数据显示图表。
            myChart.setOption(option);
        }
    })





</script>
</body>
</html>