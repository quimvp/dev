from dash import Dash
from dash import dcc
from dash import html
import pandas as pd
import plotly.express as px

app = Dash()

df = pd.DataFrame({
   "Fruit": ["Apples", "Oranges", "Bananas", "Apples", "Oranges", "Bananas"],
   "Amount": [4, 1, 2, 2, 4, 5],
   "City": ["a", "b", "c", "d", "e", "f"]
})


fig = px.bar(df, x="Fruit",y="Amount",barmode='group')
fig1=px.line(df,x="City",y="Amount")


app.layout = html.Div(children=[
   html.H1(children='Hello Dash'),


   html.Div(children='''
       Dash: A web application framework for your data.
   '''),

# id -- used when we have to define the interaction between different charts
   dcc.Graph(
       id='example-graph',
       figure=fig
   ),


   dcc.Graph(
       id='example-graph1',
       figure=fig1
   )
])


if __name__ == '__main__':
   app.run_server()