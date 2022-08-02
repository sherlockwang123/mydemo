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
        url: "/charts/getLog4Data",
        dataType: 'json',

        success: function(data1) {
            console.log(data1)
            var option = {
                title: {
                    text: '饼状图',
                    subtext: '排名前十的歌曲比例',
                    left: 'center'
                },
                tooltip: {
                    trigger: 'item'

                },
                legend: {
                    orient: 'vertical',
                    left: 'left'
                },
                series: [
                    {
                        name: 'Access From',
                        type: 'pie',
                        radius: '70%',
                        data: data1,
                        emphasis: {
                            itemStyle: {
                                shadowBlur: 10,
                                shadowOffsetX: 0,
                                shadowColor: 'rgba(0, 0, 0, 0.5)'
                            }
                        }
                    }
                ]
            };

            // 使用刚指定的配置项和数据显示图表。
            myChart.setOption(option);
        }
    })
    // 指定图表的配置项和数据





</script>
</body>
</html>