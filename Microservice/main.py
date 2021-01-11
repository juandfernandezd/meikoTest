from flask import Flask, request
import graphene
import json

app = Flask(__name__)


class Query(graphene.ObjectType):
    hello = graphene.String(name=graphene.Argument(graphene.String, default_value="stranger"),
                            age=graphene.Argument(graphene.Int))

    def resolve_hello(self, args, context, info):
        return "Hello {0} you are {1} years old".format(args['name'], args['age'])


schema = graphene.Schema(query=Query)


@app.route("/graphql", methods=['POST'])
def graphql():
    data = json.loads(request.data)
    return json.dumps(schema.execute(data['query']).data)